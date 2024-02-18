#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 1/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 5 Question 3

num = 1
sum = 0

# Processing Statements
while num <= 10:
    gpa = float (input("Enter student's G.P.A: " ))
    sum = sum + gpa
    num = num + 1
avg = sum / 10
print ("Class average is: ", round (avg, 2)) #round (avg, 2) rounds the value to two decimal places