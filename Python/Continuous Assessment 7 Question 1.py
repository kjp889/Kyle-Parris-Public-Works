#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 17/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 7 Question 1

num = int (input("Enter a number between 1 and 12: "))

while ((num < 1) or (num > 12)):
    num = int (input("ERROR!\nPlease enter another number between 1 and 12: "))

count = 1

while (count <= 12):
    print (num, "*", count, "=", num * count)
    count = count + 1
