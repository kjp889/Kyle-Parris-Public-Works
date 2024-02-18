#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 20/11/2020
#DESCRIPTION: Portfolio Continuous Assessment 7 Question 4

tot_o_cost = 0

item_name = str (input("Enter Item Name: "))
while ((item_name != "END") and (item_name != "end")):
    unit_cost = float (input("Enter Unit Cost: $"))
    c_quant = int (input("Enter Current Quantity: "))
    rating = int (input("Enter Item Rating: "))
    if ((rating == 1) and (c_quant <= 20)):
        o_quant = c_quant * 3
        o_cost = unit_cost * o_quant
        print ("---------------------------------------------")
        print ("Item Name: ",item_name,"\nUnit Cost: $",unit_cost,"\nOrder Quantity: ",o_quant,"\nOrder Cost: $",o_cost)
        tot_o_cost = tot_o_cost + o_cost
    elif ((rating == 2) and (c_quant <= 15)):
        o_quant = c_quant * 3
        o_cost = unit_cost * o_quant
        print ("---------------------------------------------")
        print ("Item Name: ",item_name,"\nUnit Cost: $",unit_cost,"\nOrder Quantity: ",o_quant,"\nOrder Cost: $",o_cost)
        tot_o_cost = tot_o_cost + o_cost
    elif ((rating == 3) and (c_quant <= 10)):
        o_quant = c_quant * 2
        o_cost = unit_cost * o_quant
        print ("---------------------------------------------")
        print ("Item Name: ",item_name,"\nUnit Cost: $",unit_cost,"\nOrder Quantity: ",o_quant,"\nOrder Cost: $",o_cost)
        tot_o_cost = tot_o_cost + o_cost
    elif ((rating == 4) and (c_quant <= 5)):
        o_quant = c_quant * 2
        o_cost = unit_cost * o_quant
        print ("---------------------------------------------")
        print ("Item Name: ",item_name,"\nUnit Cost: $",unit_cost,"\nOrder Quantity: ",o_quant,"\nOrder Cost: $",o_cost)
        tot_o_cost = tot_o_cost + o_cost
    else:
        print ("---------------------------------------------")
        print ("Order Can Wait\n")
    print ("________________________________________\n")
    item_name = str (input("Enter Item Name: "))
print ("Total Bill: $",tot_o_cost)