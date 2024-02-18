Ages = [25,30,25,50,55,60]
Heights = [170,172,180,189,190,185]
Gens = ["male","female","male","female","male","female"]
Fnames = ["Bob","Suzan","Clive","jhg","lkjhg","dfgh"]
Lnames = ["mikey","John","Loax","xcvgh","poijh","jhtf"]
import random


for currposn in range (0,(len(Ages)-1)):
    count = 0
    while (count < 10):
        randposn = random.randrange(0,len(Ages))
        if (((Ages[randposn] >= (Ages[currposn] - 10)) and (Ages[randposn] <= (Ages[currposn] + 10))) and ((Heights[randposn] >= (Heights[currposn] - 10)) and (Heights[randposn] <= (Heights[currposn] + 10))) and (Gens[randposn] != Gens[currposn])):
            print (Fnames[currposn], Lnames[currposn], "matches to", Fnames[randposn], Lnames[randposn])
            break