#AUTHOR: Kyle Parris
#ID: 1804904
#DATE: 11/12/2020
#DESCRIPTION: Programming 1 Final Assessment

count = 3
memtotal = lestotal = 0
memberships = []
lessons = []
ids = []
memcodes = []
extras = []

for count in range (3, 0 ,-1):
    password = str (input("Enter Password: "))
    if (password != "P@$$w0rD"):
        print (count - 1, "CHANCES LEFT")
    else:
        for num in range (1, 11):
            id = int (input("Enter the CUSTOMERS ID: "))
            ids.append (id)
            print ("Enter the CUSTOMERS MEMBERSHIP CODE;")
            memcode = str (input("(G) GOLD, (D) DIAMOND, (P) PLATINUM: "))
            memcodes.append (memcode)
            print ("Enter ADVANCED LESSONS CODE;")
            extra = str (input("(S) SPINNING, (F) MARTIAL ARTS, (N) NONE: "))
            extras.append (extra)
            
            if ((memcode == 'G') or (memcode == 'g')):
                cost = 4000
                membership = "GOLD"
            elif ((memcode == 'D') or (memcode == 'd')):
                cost = 7500
                membership = "DIAMOND"
            elif ((memcode == 'P') or (memcode == 'p')):
                cost = 10000
                membership = "PLATINUM"
            else:
                cost = 0
                membership = "ERROR"
                print ("INVALID CODE")
            
            if ((extra == 'S') or (extra == 's')):
                excost = 900
                lesson = "SPINNING"
                day = int (input("How many days a month? "))
            elif ((extra == 'F') or (extra == 'f')):
                excost = 1100
                lesson = "MARTIAL ARTS"
                day = int (input("How many days a month? "))
            else:
                day = 0
                excost = 0
                lesson = "NONE"
            
            memberships.append (membership)
            lessons.append (lesson)
            exmonth = excost * day
            total = cost + exmonth
            print ("ID:", id)
            print ("MEMBERSHIP:", memcode, membership, "$", cost)
            print ("LESSONS:", extra, lesson, "$", excost, "$", exmonth)
            print ("TOTAL: $", total)
            print ("-----------------------------------------------------")
            memtotal = memtotal + cost
            lestotal = lestotal + exmonth
        print ("TOTAL MEMBERSHIP COST: $", memtotal)
        print ("TOTAL LESSON COST: $", lestotal)
        break
