emp_id =[] # create an empty list for employee id
sales_count = [] # empty list for sales count

# getting data from user using parallel list processing method

for i in range(6): #get six entries for employee id and matching sales count
       e_id = int(input("Please enter employee id: "))
       emp_id.append(e_id) # add id the emp_id list
       s_count = int(input("Please enter sales count: "))
       sales_count.append(s_count) # add sales count to sales_count list

#using nested FOR to generate a sales count histogram       
print("\n\nEmp ID\tSales\tHistogram")
print("------------------------------------------------------")
for eid in range(6):
       print("\n",emp_id[eid],"\t",sales_count[eid],end="\t")       
       for sale in range(sales_count[eid]):             
              print("x",end=" ")
