package driver;

import java.io.IOException;
import java.util.Scanner;

import operations.Operation;

public class Main {
	public static void clearScreen() {  
		     
		}
	
	public static void start() {
		System.out.println("Welcome");
		//clearScreen();
		menu();
	}
	
	public static void menu() {
		int op = 0;
		while (true) {
			System.out.println("1: ADDITION");
			System.out.println("2: SUBTRACTION");
			System.out.println("3: MULTIPLICAITION");
			System.out.println("4: DIVISION");
			System.out.println("5: MODULUS");
			System.out.print("PLEASE SELECT AN OPERATION:  ");
			while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
				Scanner in = new Scanner(System.in);
				op = in.nextInt();
				if (op != 0 && op != 1 && op != 2 && op != 3 && op != 4 && op != 5){
					System.out.println("Try again");
				}
			}
			if (op > 0 && op < 6) {
				operation(op);
				break;
			} 
		}
	}
	
	public static void operation(int opr) {
		double ans = 0;
		if(opr == 1) {
			ans = Operation.add(2, 3);
			System.out.println(ans);
			menu();
		}else if(opr == 2) {
			ans = Operation.sub(2, 3);
			System.out.println(ans);
			menu();
		}else if(opr == 3) {
			ans = Operation.mult(2, 3);
			System.out.println(ans);
			menu();
		}else if(opr == 4) {
			ans = Operation.div(2, 3);
			System.out.println(ans);
			menu();
		}else{
			ans = Operation.mod(2, 3);
			System.out.println(ans);
			menu();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();

	}

}
