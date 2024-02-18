#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 25/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 8 Question 4

avg = 0

for clas in range(1,4):
    for stu in range(1,11):
        fname = str (input("Enter Students First Name: "))
        lname = str (input("Enter Students Last Name: "))
        grade1 = float (input("Enter Students 1ST grade: "))
        grade2 = float (input("Enter Students 2ND grade: "))
        grade3 = float (input("Enter Students 3RD grade: "))
        grades = grade1 + grade2 + grade3
        stuAvg = grades / 3
        avg = stuAvg + avg
        print ("Class:",clas,"\nStudent#:",stu,"\nName:",fname, lname,"\n1ST Grade:",grade1,"\n2ND Grade:",grade2,"\n3RD Grade:",grade3,"\nAverage:",round (stuAvg, 2))
    classAvg = avg / 10
    print ("-----------------------------------")
    print ("Class Average------------", round (classAvg, 2))
