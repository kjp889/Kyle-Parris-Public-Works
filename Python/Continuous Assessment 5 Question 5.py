#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 1/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 5 Question 5

num = 1

int = int (input("Enter an integer: "))

while num <= int:
    if int % num == 0:
        print (num, "is a factor")
    num = num + 1