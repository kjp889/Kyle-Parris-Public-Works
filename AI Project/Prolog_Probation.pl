%GROUP MEMBERS:
%Kyle Parris - 1804904
%Carlos Thompson - 1903479
%Mark Vernon - 1908916
%Demar Taylor - 1805955
%Jheanelle Richards - 1907114


%%%%%%%%%%%%%%%%%%DYNAMIC VALUES%%%%%%%%%%%%%%%%%%%%%%
%:- dynamic get_student_info/5.

:- use_module(library(clpfd)).
:- dynamic gpa/3.
:- dynamic points_earned/3.
:- dynamic total_earned/3. 
:- dynamic total_done/3.

%%%%%%%%%%%%%%%%%%FACTS%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
grade('A+').
grade('A').
grade('A-').
grade('B+').
grade('B').
grade('B-').
grade('C+').
grade('C').
grade('D+').
grade('D').
grade('E').
grade('U').

grade_point('A+', 4.30).
grade_point('A', 4.0).
grade_point('A-', 3.67).
grade_point('B+', 3.33).
grade_point('B', 3.0).
grade_point('B-', 2.67).
grade_point('C+', 2.33).
grade_point('C', 2.29).
grade_point('D+', 1.67).
grade_point('D', 1.33).
grade_point('E', 0.86).
grade_point('U', 0.00).

%student(id(1),name('test tester'),email('test@test.test'),school('scit'),programme('computing')).
%student(id(2),name('test tester'),email('test@test.test'),school('scit'),programme('computing')).
%student(id(3),name('test tester'),email('test@test.test'),school('scit'),programme('computing')).

%moduledetails(module(code(1),name('programing'),numcredit(3)),year(2010),semester(1),stuid(1),gp(2)).



%%%%%%%%%%%%%%%%%%RULES%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%get_student_info(ID,Name,Email,School,Programme):- student(id(ID),name(Name),email(Email),school(School),programme(Programme)).


%%%%%%%%%%%%%%%%%%%%CALCULATIONS%%%%%%%%%%%%%%%%%%%%%%%
gpa(Total_earned,Total_done,GPA):- GPA is Total_earned / Total_done.

points_earned(Credit,Grade,Point):- grade_point(Grade,X), Point is Credit * X.
               
total_earned(Total_earned,A,Grade,Credit):- points_earned(Credit,Grade,Point), Total_earned is A + Point. 

total_done(Total_done,A,Credit):- Total_done is A + Credit.

%%%%%%%%%%%%%%%%%Useful predicates%%%%%%%%%%%%%%%%%%%%%
%similar to member – checks if an element is in a list
in_list(X,[X|_]).
in_list(X,[_|T]) :- in_list(X,T).

%Counts the elements is in a list
countList([], 0).
countList([_|T], N) :- countList(T, NT), N is 1+NT.

%Returns the total of the elements is in a list
sumList([], 0).
sumList([H|T],S) :- sumList(T, NS), S is H + NS.

%Returns the maximum element is in a list
maxList([E],E).
maxList([H|T],Y):- maxList(T,Y), H < Y,!.
maxList([H|_],H).

%works like the append function
concatlist([],List2,List2).
concatlist([Item|Tail],List2,[Item|Newlist]) :-
concatlist(Tail,List2,Newlist).