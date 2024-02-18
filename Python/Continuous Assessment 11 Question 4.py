#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 30/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 11 Question 4

count = 1
board = travel = total = 0
status = []
ids = []
tuitions = []

id = int (input("Enter the student's ID number: "))
while ((count <= 50) and (id != 0)):
    ids.append (id)
    tuition = float (input("Enter tuition: $"))
    tuitions.append (tuition)
    total = total + tuition
    stats = str (input("Enter boarding status (B)Boarding or (T)Traveling: "))
    if ((stats == 'B') or (stats == 'b')):
        board = board + 1
        status.append ("Boarding")
    else:
        travel = travel + 1
        status.append ("Traveling")
    count = count + 1
    id = int (input("Enter the student's ID number: "))
print ("ID#\t Status \tTuition")
print ("----------------------------------")
for count1 in range (0,(count - 1)):
    print (ids[count1],"\t",status[count1],"\t$",tuitions[count1])
print ("----------------------------------")
print ("# of Boarders: ", board,"\n# of Travelers: ", travel,"\nTotal tuition: $", total)