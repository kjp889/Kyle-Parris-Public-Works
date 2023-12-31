package operations;

public class Operation {
	
	public static double add (double num1, double num2) {
		double ans = 0;
		
		ans = num1 + num2;
		
		return ans;
	}
	
	public static double sub (double num1, double num2) {
		double ans = 0;
		
		ans = num1 - num2;
		
		return ans;
	}
	
	public static double mult (double num1, double num2) {
		double ans = 0;
		
		ans = num1 * num2;
		
		return ans;
	}
	
	public static double div (double num1, double num2) {
		double ans = 0;
		
		if (num2 != 0) {
			ans = num1 / num2;
		}else {
			System.out.println("Error Can Not Divide By Zero");
		}
		
		return ans;
	}
	
	public static double mod (double num1, double num2) {
		double ans = 0;
		
		if (num2 != 0) {
			ans = num1 % num2;
		}else {
			System.out.println("Error Can Not Divide By Zero");
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = add(1.1, 2);
		
		System.out.println(test);
	}

}
