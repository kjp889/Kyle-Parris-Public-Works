:- dynamic gpa/1.
% Define the GPA scale
gpa_scale([
    (90, 4.0),
    (80, 3.0),
    (70, 2.0),
    (60, 1.0),
    (50, 0.0)
]).

% Define the gpa/1 predicate
gpa(Score) :-
    % Find the corresponding GPA for the given score
    findall(GPA, (member([G, P], gpa_scale), Score >= G, Score =< P), GPAList),
    % If there's a match, return the GPA
    (length(GPAList) > 0 ->
        write(list_to_ordinal(GPAList)),
        write(': '),
        write(head(GPAList)),
        nl,
        true;
        % If there's no match, return an error message
        write('Error: No GPA found for the given score.'),
        nl
    ).

% Define a helper function to convert a list to an ordinal string
list_to_ordinal([H|_]) --> ['1st', '2nd', '3rd', '4th', '5th'][H-1].
list_to_ordinal([_|T]) --> ['2nd', '3rd', '4th', '5th'][T-1], list_to_ordinal(T).
list_to_ordinal([]) --> '1st'.