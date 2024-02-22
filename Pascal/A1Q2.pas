program A1Q2 (input, output);
var
   num, square, cube: real;
begin
     write ('Enter a NUMBER: ');
     readln (num);
     square := num*num;
     cube := square*num;
     writeln ('The square is:', square);
     writeln ('The cube is:', cube);
end.
