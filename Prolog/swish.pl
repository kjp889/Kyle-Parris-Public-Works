Lab Exercises (Rules)
1. Using the text editor, translate the following into Prolog.
A bird is anything that chirps and has feathers or anything that flies. A canary is a
yellow bird. Tweety flies. Tweety and Sonny are yellow. Sonnie and Parkie chirps. Parkie
and Sonnie has feathers. Tweety is a friend of Tom. Tom is a cat. Cats will eat any
canary that is not their friend.
a) Who is a canary?
b) Was anyone eaten?
c) If a) Who was eaten and by Whom

2. In the kingdom Logiquogne the penal code contains the following laws:
All the thieves are criminals.
All the persons who help a criminal are also criminals.
The adult criminals go to prison.
The minor criminals go to a juvenile centre.
Adults are anyone overage.
Minors are underage.
Tom and Arlene are thieves. Tom, Phil, Paul and Sara are underage. Arlene, Mirelle,
Carolene and Charlese are overage.
Phil helps Mirelle, Paul helps Arlene and Charles. Arlene helps Phil, Mirelle helps Sara,
Charles helps Caroline and Caroline helps Tom
The king has asked you to write a Prolog program to replace the judge in the courthouse.
Translate the laws into Prolog, using a consistent vocabulary:
a) Who goes to prison?
b) Who goes to the juvenile centre?
c) Who is the new judge?
3. Translate the following sentences into Prolog

John eats all kinds of food. Apples are food. Oysters are food. Anything anyone
eats is food. Tom eats snakes. Sue eats everything Tom eats.
Save the program in a file called “food.pl” now read them into Prolog and formulate
queries to find out:
1. What does John eats?
2. What does Sue eats?
3. Is there anything which both Sue and Tom eat?
4. Who eats snakes?

4. Using your genealogy database created in lab 1. Use your queries to define rules to for
the various family relationships.
a) use the sibling predicate to build rules for brothers, sisters,
b) Translate the following into Prolog rules
i. Everybody who has a child is happy.
ii. For all X, if X has a child who has a sister then X has two children
(introduce the new relation hasTwoChildren).