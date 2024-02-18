#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 25/11/2020
#DESCRIPTION: Progrmming 1 Lab Test

print ("__________ WELCOME TO ABC CAR MART_____________")
print ("_____________1. To buy car_____________________")
print ("_____________2. To rent car____________________")
print ("_____________3. To lease car___________________")
print ("_____________4. To exit________________________")
print ("_______________________________________________")

choice = int (input("Make Selection: "))
while (choice != 4):
    if (choice == 1):
        print ("1. To buy car cash")
        print ("2. To buy car via loan")
        print ("3. To exit")
        num1 = int (input("Make choice: "))
        if (num1 == 1):
            num2 = float (input("Enter the cost of the Car: $"))
            num2 = num2 * 0.95
            print ("Cost of car is $",round (num2, 2))
        elif (num1 == 2):
            num2 = float (input("Enter the cost of the Car: $"))
            num2 = num2 * 1.25
            print ("Cost of car is $",round (num2, 2))
    elif (choice == 2):
        print ("A security deposit of 25% is required for rental");
        num3 = int (input("Please enter number of days you wish to rent car: "))
        print ("Your rental total is: $", (1.25 * (num3 * 5000)))
    elif (choice == 3):
        print ("1.to lease car")
        print ("2. To return lease")
        print ("3. To exit");
        num4 = int (input("Please enter choice: "))
        if (num4 == 1):
            print ("Your lease cost is $25,000.00")
        elif (num4 == 2):
            print ("Thanks for return the car in good condition. \nYour reward is $2000") 
    else:
        print ("Invalid Selection\n")
    choice = int (input("Make Selection: "))
                
