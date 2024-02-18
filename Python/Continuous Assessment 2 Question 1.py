#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 25/10/2020
#DESCRIPTION: Portfolio Continuous Assessment 4 Question 6

#Data Collection Statements
name = str (input("Please Enter Student's Name: " ))
tuition = float (input("Please Enter their Tuition Amount: " ))
gpa = float (input("Please Enter their gpa: " ))
amount = 0

#Test Statements
if gpa >= 3.5 :
    amount = tuition * .80
    print ("Scholarship Eligible")
elif gpa >= 3 :
    amount = tuition * .60
    if tuition > 550000 :
        print ("Grant Eligible")
    else:
        print ("Loan Eligible")
elif gpa >= 2.7 :
    amount = tuition * .10
    print ("Textbook Voucher Eligible")
else:
    print ("Not Eligible")

print ("Student's Name: ", name)
print ("G.P.A:", gpa)
print ("Tuition is $", tuition)
print ("Grant Amount is $", amount)