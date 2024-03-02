/*Kyle Parris
 * 1804904
 * 27/11/2022
 */

package labTest2;

public class SubjectNode {
	private String subName;
	private double grade;
	private SubjectNode nxtNode;
		
	public SubjectNode() {
		this.subName = " ";
		this.grade = 0.0;
		this.nxtNode = null;	
	}

	public SubjectNode(String subName, double grade, SubjectNode nxtNode) {
		this.subName = subName;
		this.grade = grade;
		this.nxtNode = nxtNode;
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

	public void showNode() {
		System.out.println(toString());
	}
	
	
	@Override
	public String toString() {
		return "SubjectNode [subName=" + subName + ", grade=" + grade + ", nxtNode=\n" + nxtNode + "]";
	}
	
	
}
