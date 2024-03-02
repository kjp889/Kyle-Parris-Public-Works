/*Kyle Parris
 * 1804904
 * 27/11/2022
 */

package labTest2;

public class StudentLinkedList {
	private SubjectNode head;
	private int subCount = 0;
	private double gradeSum = 0;

	public StudentLinkedList() {
		this.head = null;
	}
	
	public StudentLinkedList(SubjectNode head) {
		this.head = head;
	}
	
	public void insertAtFront(String subName, double grade) {
		SubjectNode temp = new SubjectNode();
		if(temp != null) {
			temp.setSubName(subName);
			temp.setGrade(grade);
			gradeSum = gradeSum + grade;
			temp.setNxtNode(null);
			if(head == null) {
				head = temp;
			}
			else{
				temp.setNxtNode(head);
				head = temp;
			}
			subCount++;
		}
		else {
			System.out.println("Full list.");
		}
	}
	
	public void showList() {
		head.showNode();
		
		System.out.println(subCount);
		
	}
	
	public void yearlyAvg() {
		
		double avg = gradeSum/subCount;
				
		System.out.print("Yearly Average = ");
		System.out.println(avg);
	}

}
