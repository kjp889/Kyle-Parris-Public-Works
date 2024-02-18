#Write a program that will give the user a menu options to find the square, cube or if the number is even or odd. The user should enter 4 to exit.
#1a Use do while (use equivalent in python) 
#2a Use switch & case (use equivalent in python) 

print("\n** *** * *MENU *******");
print("\n1. to find square*****");
print("\n2. to find cube ******");
print("\n3. even or odd *******");
print("\n4. to exit ***********");
print("\n**********************");

choice = int (input("enter choice "))
while(TRUE):
 num=int(input("please enter number "))
 if(choice==1):
     print("the square of the number is ",num*num)
 elif(choice==2):
     print("the Cube of the number is ",num*num*num)
 elif(choice==3):
     if(num%2 == 0):
       print("the number is EVEN")
     else:
       print("the number is ODD")
 else:
     print("Invalid Choice")
 break
if(choice==4):
     print("GOODBYE")
#    switcher = { 
#        0: "zero", 
#        1: "one", 
#        2: "two", 
#    } 

    # get() method of dictionary data type returns 
    # value of passed argument if it is present 
    # in dictionary otherwise second argument will 
    # be assigned as default value of passed argument 
 #   return switcher.get(argument, "nothing") 

# Driver program 
#if __name__ == "__main__": 
 #   argument=0
  #  print numbers_to_strings(argument) 
# Function to convert number into string 
# Switcher is dictionary data type here 
#def numbers_to_strings(argument): 
 #   switcher = { 
  #      0: "zero", 
   #     1: "one", 
    #    2: "two", 
    #} 

    # get() method of dictionary data type returns 
    # value of passed argument if it is present 
    # in dictionary otherwise second argument will 
    # be assigned as default value of passed argument 
#    return switcher.get(argument, "nothing") 

# Driver program 
#if __name__ == "__main__": 
 #   argument=0
  #  print numbers_to_strings(argument) 
