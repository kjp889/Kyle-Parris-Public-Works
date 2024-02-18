#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 17/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 7 Question 2

count = 1
swim = tennis = badmin = 0

num = int (input("Enter the number of record you want to enter: "))
while (count <= num):
    name = str (input("Enter the customer's name: "))
    code = str (input("Enter the customer's event code: "))
    paid = float (input("Enter the amount paid by customer: $"))
    if ((code == 'T') or (code == 't')):
        fee = 18000
        balance = fee - paid
        count = count + 1
        tennis = tennis + 1
        print ("Name:",name,"\nEvent:",code,"- Tennis\nFee: $",fee,"\nPaid: $",paid,"\nBalance: $",balance,"\n\n")
    elif ((code == 'B') or (code == 'b')):
        fee = 14000
        balance = fee - paid
        count = count + 1
        badmin = badmin +1
        print ("Name:",name,"\nEvent:",code,"- Badminton\nFee: $",fee,"\nPaid: $",paid,"\nBalance: $",balance,"\n\n")
    elif ((code == 'S') or (code == 's')):
        fee = 16000
        balance = fee - paid
        count = count + 1
        swim = swim + 1
        print ("Name:",name,"\nEvent:",code,"- Swimming\nFee: $",fee,"\nPaid: $",paid,"\nBalance: $",balance,"\n\n")
    else:
        print ("INVALID CODE\n\n")
    
print ("# Swimming is:",swim, "\n# Badminton is:",badmin, "\n# Tennis is:",tennis)