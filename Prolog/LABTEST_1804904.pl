/*
Name: Kyle Parris
ID#: 1804904
*/


taxable:-  write('Enter name: '),read(Name),
           nl,write('Enter Tax Revenue Number (Integer): '),read(Trn),
           nl,write('Enter income: '),read(Income),
           nl,write('Are you married (y/n)?: '),read(Married),
                (Married == y -> married_func(MarriedReturn,ChildrenReturn); MarriedReturn is 0, ChildrenReturn is 0),
           nl,nl,write('****************Tax Payable Report******************'),
           calc_tax(Income,Tax),nl,dispose_income(Income,MarriedReturn,ChildrenReturn,Tax,Disposable),
           nl,write('Name: '),write(Name),
           nl,write('Number: '),format('~d',[Trn]),
           nl,write('Taxable Income: '),format('$~2f',[Income]),
           nl,write('Taxes: '),format('$~2f',[Tax]),
           nl,nl,write('Refund'),
           nl,write('Married: '),format('$~2f',[MarriedReturn]),
           nl,write('Married with children: '),format('$~2f',[ChildrenReturn]),
           nl,write('Disposable Income: '),format('$~2f',[Disposable]),
           nl,nl,runagain.
           
runagain:-  nl,write('Another Entry (y/n): '),nl,read(Ans),
    	(Ans == y ->   taxable;nl,write('bye')).

married_func(MarriedReturn,ChildrenReturn):-  nl,write('Do you have children (y/n)?: '),read(Children),
                (Children == y -> nl,write('How many: '),read(ChildrenCount),
                MarriedReturn is 0, ChildrenReturn is (ChildrenCount * 60);MarriedReturn is 0,ChildrenReturn is 0),nl.

calc_tax(Income,Tax):-  nl,Tax is 0, (Income < 5462 -> Tax is 0;
              Income < 18894 -> Tax is ((Income - 5462) * 0.40);
              Income < 39500 -> Tax is (2150 + ((Income - 18894) * 0.50));
              Income < 55900 -> Tax is (2500 + ((Income - 39500) * 0.60));
              Income >= 55900 -> Tax is (4500 + ((Income -55900) * 0.75))),nl.

dispose_income(Income,MarriedReturn,ChildrenReturn,Tax,Disposable):-  nl, Disposable is (Income + (MarriedReturn + ChildrenReturn) - Tax).




/* Question 2*/
car_dealer('Zues').
car_dealer('Staub').
car_dealer('Mercury').

country('USA').
country('Japan').
country('Germany').
country('Norway').

is_in('Zues','Cleveland').
is_in('Mercury','Oslo').
is_in('Staub','Hirashima').

ships_to('Zues','Hirashima').
ships_to('Zues','Cleveland').
ships_to('Mercury','Hirashima').
ships_to('Mercury','Berlin').
ships_to(X):-(car_dealer(X),country(Y)).
