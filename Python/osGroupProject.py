import threading
import time
import random

# Number of compartments in the door
NUM_COMPARTMENTS = 4

# Maximum capacity of the store
MAX_STORE_CAPACITY = 30

# List to store customers waiting to enter the store
waiting_customers = []

# List to store customers currently shopping in the store
shopping_customers = []

# Lock to protect access to waiting_customers list
waiting_customers_lock = threading.Lock()

# Lock to protect access to shopping_customers list
shopping_customers_lock = threading.Lock()

# Semaphore to control access to the door
door_semaphore = threading.Semaphore(NUM_COMPARTMENTS)

# Event to signal to all threads that the store is closing
closing_event = threading.Event()


class Customer:
    def __init__(self, customer_id, arrival_time):
        self.id = customer_id
        self.arrival_time = arrival_time
        self.entry_time = None
        self.shopping_time = None
        self.exit_time = None

    def __str__(self):
        return f"Customer {self.id} (Arrival: {self.arrival_time}, Entry: {self.entry_time}, Shopping: {self.shopping_time}, Exit: {self.exit_time})"


def generate_customers():
    """Generates a list of customers to simulate entering the store."""
    for i in range(50):
        arrival_time = time.time()
        customer = Customer(i, arrival_time)
        with waiting_customers_lock:
            waiting_customers.append(customer)


def enter_store(customer):
    """Simulates a customer entering the store."""
    door_semaphore.acquire()
    customer.entry_time = time.time()
    with shopping_customers_lock:
        shopping_customers.append(customer)
    print(f"{customer} entered the store.")


def exit_store(customer):
    """Simulates a customer exiting the store."""
    customer.exit_time = time.time()
    with shopping_customers_lock:
        shopping_customers.remove(customer)
    door_semaphore.release()
    print(f"{customer} exited the store.")


def shop(customer):
    """Simulates a customer shopping in the store."""
    customer.shopping_time = random.uniform(5, 30)
    time.sleep(customer.shopping_time)


def customer_thread():
    """Thread function that simulates a customer entering, shopping in, and exiting the store."""
    while True:
        with waiting_customers_lock:
            if len(waiting_customers) == 0:
                # No more customers waiting to enter the store
                break
            # Get the next customer in line to enter the store
            customer = waiting_customers.pop(0)
        enter_store(customer)
        shop(customer)
        exit_store(customer)


def main():
    # Generate a list of customers to simulate entering the store
    generate_customers()

    # Start threads to simulate customers entering, shopping in, and exiting the store
    threads = []
    for i in range(MAX_STORE_CAPACITY):
        thread = threading.Thread(target=customer_thread)
        thread.start()
        threads.append(thread)

    # Wait for all customer threads to finish
    for thread in threads:
        thread.join()

    # Print report of all customers and their attributes
    with open("C:store_report.txt", "w") as f:
        f.write("Customer ID | Arrival Time | Entry Time | Shopping Time | Exit Time | Response Time | Waiting Time | Turnaround Time\n")
        f.write("------------|--------------|------------|---------------|-----------|--------------|--------------|----------------\n")
        for customer in shopping_customers:
            response_time = customer.entry_time - customer.arrival_time
            #waiting_time = customer.
