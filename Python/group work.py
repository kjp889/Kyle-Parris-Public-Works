#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 21/11/2020
#DESCRIPTION: Group WOrk

count = 1
count1 = 1
tennis = 0
swim = 0
badmin = 0
names = []
pays = []
events = []
balances = []
fees = []
codes = []

num = int (input("Enter the number of record you want to enter: "))
while (count <= num):
    print (count)
    code = str (input("Enter the customer's event code: "))
    if ((code == 'T') or (code == 't')):
        codes.append(code)
        name = str (input("Enter the customer's name: "))
        names.append(name)
        paid = float (input("Enter the amount paid by customer: $"))
        pays.append(paid)
        fee = 18000
        fees.append(fee)
        balance = fee - paid
        balances.append(balance)
        event = "Tennis"
        events.append(event)
        count = count + 1
        tennis = tennis + 1
    elif ((code == 'B') or (code == 'b')):
        codes.append(code)
        name = str (input("Enter the customer's name: "))
        names.append(name)
        paid = float (input("Enter the amount paid by customer: $"))
        pays.append(paid)
        fee = 14000
        fees.append(fee)
        balance = fee - paid
        balances.append(balance)
        event = "Badminton"
        events.append(event)
        count = count + 1
        badmin = badmin + 1
    elif ((code == 'S') or (code == 's')):
        codes.append(code)
        name = str (input("Enter the customer's name: "))
        names.append(name)
        paid = float (input("Enter the amount paid by customer: $"))
        pays.append(paid)
        fee = 16000
        fees.append(fee)
        balance = fee - paid
        balances.append(balance)
        event = "Swimming"
        events.append(event)
        count = count + 1
        swim = swim + 1
    else:
        print ("INVALID CODE\n")
print ("\n\nNumber of Tennis:",tennis,"\nNumber of Badminton:",badmin,"\nNumber of Swimming:",swim)
print("\nNames\tEvents\t\tFees\tPaid\tBalances")
print("------------------------------------------------------")
for count1 in range(num):
       print("\n",names[count1],"\t",codes[count1],events[count1],"\t",fees[count1],"\t",pays[count1],"\t",balances[count1])    
