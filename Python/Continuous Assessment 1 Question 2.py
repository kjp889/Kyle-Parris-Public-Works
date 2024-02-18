#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 20/09/2020
#DESCRIPTION: Portfolio Continuous Assessment 1 Question 5

#prompts the user to enter their weight and stores it in the variable weight
weight=float(input ("Enter weight:"))

#prompts the user to enter their height and stores it in the variables feet and inch
print ("Enter the height:")
feet=int(input ("Feet:"))
inch=int(input ("Inch:"))

#converts the user inches to feet and adds it to their feet
height= feet+ inch/12

#prompts the user to enter their shoe size and stores it in the variable size
size=float(input ("Enter the size:"))

#displays the values stored in weight, height and size along with the text "Your measurements are"
print ("Your measurements are", weight,"kg,", height,"ft.,", size)