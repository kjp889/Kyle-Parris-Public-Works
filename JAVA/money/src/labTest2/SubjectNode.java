package labTest2;

public class SubjectNode {
	private String subName;
	private double grade;
	private SubjectNode nxtNode;
	private SubjectNode previousNode;
	
	public SubjectNode() {
		this.subName = " ";
		this.grade = 0.0;
		this.nxtNode = null;
		this.previousNode = null;
		
	}

	public SubjectNode(String subName, double grade, SubjectNode nxtNode, SubjectNode previousNode) {
		this.subName = subName;
		this.grade = grade;
		this.nxtNode = nxtNode;
		this.previousNode = previousNode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public SubjectNode getNxtNode() {
		return nxtNode;
	}

	public void setNxtNode(SubjectNode nxtNode) {
		this.nxtNode = nxtNode;
	}

	public SubjectNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(SubjectNode previousNode) {
		this.previousNode = previousNode;
	}
	
	public void showNode() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "SubjectNode [subName=" + subName + ", grade=" + grade + ", nxtNode=" + nxtNode + "]";
	}
	
	
}
