package code_Projects;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		int max = arr.length;
		System.out.println(max);
		for(int i = max-1; i>=0; i--){
			System.out.print(arr[i]);
}
	}
}
