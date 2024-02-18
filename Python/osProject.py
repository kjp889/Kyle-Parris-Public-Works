# Names:  Danielle Hemmings, 
#         Tyandra Taylor, 
#         Chadwick Hewitt, 
#         Stephan Scott, 
#         Kyle Parris (1804904)
#OS Programming Project

import threading
import time
import random

inLine = []
outLine = []
doorIn = [None, None]
doorOut = [None, None]


class Customer:
    def __init__(self, cusNum, arrivalTime, entryTime, shoppingTime, waitTime, exitTime):
        self.cusNum = cusNum
        self.arrivalTime = arrivalTime
        self.entryTime = entryTime
        self.shoppingTime = shoppingTime
        self.waitTime = waitTime
        self.exitTime = exitTime
        
    def generateCustomer():
        for x in range(50):
            arrTime = round(time.time(), 2)
            cus = Customer(x, arrTime, 0, 0, 0, 0)
            inLine.append(cus)
            random_time = random.uniform(0, 5) # Generate a random float between 0 and 5
            time.sleep(random_time) # Pause the program for the random duration
        
    def __str__(cus):
        return f"Customer {cus.cusNum} gets in line at {cus.arrivalTime},\n enters the store at {cus.entryTime},\n finishes shopping at {cus.shoppingTime},\n and exited the store at {cus.exitTime},\n with a wait time of {cus.waitTime}\n"
  
def calculateWaitTime(cus):
    cus.waitTime = cus.exitTime - cus.arrivalTime

class Door:
    def __init__(self):
        self.compartmentsIn = [None, None]
        self.compartmentsOut = [None, None]
        #self.inside = True
        self.lock = threading.Lock()
   
    def onEntry(self, cus):
        with self.lock:
            #cus = inLine[0]
            cus.entryTime = round(time.time(), 2)
            outLine.append(cus)
            inLine.pop(0)
            t = threading.Thread(target=self.shop, args=(cus,))
            t.start()
        
    def shop(self, cus):
        time.sleep(random.uniform(1, 10))
        cus.shoppingTime = round(time.time(),2)
        #print(f"Customer {cus.cusNum} has finished shopping at {cus.shoppingTime}")
        print("\n============================================================\n")
        self.onExit(cus)
        
    
    def onExit(self,cus):
        with self.lock:
            cus.exitTime = round(time.time(), 2)
            self.compartmentsOut.append(cus)
            calculateWaitTime(cus)
            print(cus)
            #outLine.pop(cus.cusNum)

    
    def rotate(self):
        cusIn = inLine[0]
        if any(compartment is None for compartment in self.compartmentsIn):
            self.compartmentsIn.append(cusIn)
        if len(self.compartmentsOut)>0:
            self.compartmentsOut.pop(0)
        self.onEntry(cusIn)
        if any(compartment is None for compartment in self.compartmentsOut):
            if len(outLine)>3:
                i = int(random.randrange(0, 5))
                cusOut = outLine[i]
                self.onExit(cusOut)
        time.sleep(.2)

if __name__ == '__main__':
    door = Door()
    Customer.generateCustomer()
    while len(inLine) > 0:
        door.rotate()
    
