package labTest2;

public class StudentLinkedList {
	private SubjectNode head;
	private int subCount = 0;

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
			temp.setNxtNode(null);
			temp.setPreviousNode(temp);
			if(head == null) {
				head = temp;
			}
			else{
				temp.setNxtNode(head);
				head = temp;
			}
			temp.showNode();
			subCount++;
		}
		else {
			System.out.println("Memory full; Can’t insert.");
		}
	}
	
	public void show() {
		System.out.println(subCount);
		for(int i = subCount; i > 0; i--) {
			
		}
	}
	
	public void yearlyAvg() {
		
	}

}
