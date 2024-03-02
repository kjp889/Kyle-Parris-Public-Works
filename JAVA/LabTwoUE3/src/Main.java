
public class Main {

	public static void main(String[] args) {

		OfficeWorker obj1 = new OfficeWorker(1001,"Kyle","Parris","SCIT",28,1,2022);
		obj1.display();
		obj1.setEmployeeNumber(1002);
		//obj1.display();
		int idNum = obj1.getEmployeeNumber();
		System.out.println("ID Num: " + idNum);
	}
}
