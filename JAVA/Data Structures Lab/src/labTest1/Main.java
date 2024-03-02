/*Kyle Parris
 * 1804904
 * 01/11/2022
 */

package labTest1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student K = new Student();
		K.display();
		
		Student P = new Student("Kyle", "Parris", 1804904, 'p','C');
		System.out.println();
		P.displayStudInfo();
		System.out.println();
		P.displayStudSubjects();
		System.out.println();
		P.display();

	}

}
