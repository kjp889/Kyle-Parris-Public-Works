/*Arithmetic
Concepts:
- Write - allows the output of text or variable values
- read - accepts input (always precede with new line command: nl)
- calling functions
- Arithmetic calculations
- If, then, else statements

Write and Read
Create a function basic/0 that accepts a name and two amounts then uses
write to output what was recorded.
basic/0 - means that there are no variables in header. basic:-
basic/1 - i variable in the header
tab(5) creates tab of 5 characters
nl - new line
*/
first:- write(' Enter name: '),nl,read(N),
        nl, write('Name: '),tab(6),write(N).
        
basic:- write(' Enter name: '),nl,read(N),
        nl,write(' Enter num1: '),nl,read(Num1),
        nl,write(' Enter num2: '),nl,read(Num2),
        nl, write(' Name: '),write(N),
        nl, write(' First Number: '),tab(25),write(Num1),
        nl, write(' Second Number: '),write(Num2).
%________________________________________________________
%exercise: create a funtion mybasic/0 that accepts a person's age and
% sex and outputs the name and sex recorded.
%________________________________________________________

% create basic_calc/0 to output the results of the following
% calculations on the two numbers: addition,subtraction,multiplication
% and average. Another function is to be called to calculate the
% average.
basic_calc:-nl,write(' Enter num1: '),nl,read(Num1),
nl,write(' Enter num2: '),nl,read(Num2),
Myname = 'Howard',
Sum is Num1 + Num2, %addition
Sub is Num1 - Num2, %subtraction
Mult is Num1 * Num2, %multiplication
doaverage(Num1,Num2,Avg), %doaverage function called
Pow is Num1 ^ 2, %Num 1 raised to the power 2
nl, write(' Name: '),write(Myname),
nl, write('Sum: '),write(Sum),
nl, write('Difference: '),write(Sub),

nl, write('Product: '),write(Mult),
nl, write('Num 1 to Power 2: '),write(Pow),
nl, write('Average: '),write(Avg).
%N1(Num1) and N2 (Num2) received. Avg returned to basic_calc
doaverage(N1,N2,Avg):- Avg is (N1+N2)/2.
%________________________________________________________
% exercise: create a function mybasic_calc/0 that accepts two numbers
% and outputs the result for (Num1 + Num2) - (Num2 * 2)
%________________________________________________________
/*
Equality operators
The operator == checks for equality
X == 1. % checks if X is equal to 1
X == Y. % checks if X is equal to Y
Other equality operators
<, >, >=, =< (Please note less than is written as: =<)
create check_midpoint/0 to check if a number entered is greater than,
equal to, or less than 10
*/

/*
If, Then,Else
X < Y -> write(X);write(Y).
The above statement reads if X < Y then write X else write Y
The arrow -> represents then
The semicolon ; represents else
Every if statement has to have an else statement.
*/
/*
Create docalc/0 to accept a name and salary, calculate the gct based
on the below then output the name, salary, gct and net salary
(salary+allowance -gct):
allowance: if children: 100 * no of children
if no child: 50.
Salary GCT
1 – 2000 10%
2001-4000 15%

4001-5000 20% of Salary amount over 1000
Over 5000 25%
*/

/* Practice
Create docalc1/0 to accept a name and salary, calculate the gct based
on the below then output the name, salary, gct, gct percent and net
salary (salary - gct):
Salary GCT
1 – 2499.99 7%
2500-3999.99 12%
4001-5700 20%
Over 5700 26%
*/

%format. alternative to write. Research this.
fmtout :-
RunT is 3.449, Inf is 60344,
format('~tStatistics~t~52|~n~n'),
format('Runtime: ~`.t ~2f~40| Inferences: ~`.t ~D~72|~n',

[RunT, Inf]).

%clears interpreter
cls :- write('\33\[2J').