cls :- write('\e[H\e[2J').
/*
Exercise 1
Let us extract the facts and rules from the below paragraph.
Sue reads all books written by Stephen king. Carrie is a book. The Langoliers is a mystery book. Stephen
king is the author of Carrie. He is also the author of the Langoliers. Sue likes all mystery books that she
reads. Jane will read any book that Sue likes or any book written by Phillip. Torrid is a book. Phillip is the
author of Torrid.
rule - refer to facts and/other rules
*/



/*
Exercise 2
Let us extract the facts and rules from the below paragraph.
A dog is anything that barks and has fur or anything that runs.
A terrier is a short dog. Tweety and Sonny are short. Sonny and Parkie barks.
Parkie and Sonny has fur. Tweety runs. Tweety is a friend of Tom.
Tom is a catcher. Catchers will capture any terrier that is not their friend.
Catcher will pet any dog that has fur.
A yorkie is a dog that is not a terrier.
Who is a terrier?
Was anyone captured?
Who was captured and by whom?
Who got petted
*/
short('Tweety').
short('Sonny').
barks('Sonny').
barks('Parkie').
fur('Sonny').
fur('Parkie').
runs('Tweety').
friend('Tweety',tom).
catcher(tom).
dog(X):-(barks(X),fur(X));runs(X).
terrier(X):-dog(X),short(X).
captured(Catcher,Dog):-catcher(Catcher),terrier(Dog),not(friend(Dog,Catcher)).
unlucky(X):-captured(_,X).

/*%Hint Question 2
thief(tom).
thief(arlene).
helps(charles,caroline).
helps(caroline,tom).
criminal(X):- thief(X).
criminal(X):- helps(X,Y),criminal(Y).
%hint question 3
food(oyster).
food(X):- eats(_,X).
eats(tom,snakes).*/