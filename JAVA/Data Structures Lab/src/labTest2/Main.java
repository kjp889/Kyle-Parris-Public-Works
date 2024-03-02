/*Kyle Parris
 * 1804904
 * 27/11/2022
 */

package labTest2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentLinkedList list = new StudentLinkedList();
		
		/*list.insertAtFront("Math", 1);
		list.insertAtFront("Englis", 1);
		list.insertAtFront("Englis", 1);
		list.showList();
		list.yearlyAvg();*/
		
		Scanner input = new Scanner(System.in);
		String subName = " ";
		double grade = 0;
		
		System.out.println("Enter Subject Name, xxx to exit: ");
		subName = input.next();
		while(!subName.equalsIgnoreCase("xxx")) {
			System.out.println("Enter Subject Grade: ");
			grade = input.nextDouble();
			//StudentLinkedList list = new StudentLinkedList();
			list.insertAtFront(subName, grade);
			System.out.println("Enter Subject Name, xxx to exit: ");
			subName = input.next();
		}
		list.yearlyAvg();
	}

}
