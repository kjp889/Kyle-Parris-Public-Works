package groupWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet p = new Pet(1,"ben","dog",3);
		Pet p1 = new Pet(2,"ben","dog",3);
		Pet p2 = new Pet(3,"ben","dog",3);
		Pet p4 = new Pet(4,"ben","dog",3);
		
		p.show();
		
		CageQueue cage = new CageQueue();
		
		cage.enqueue(p);
		cage.enqueue(p1);
		cage.enqueue(p2);
		cage.enqueue(p4);
		
		cage.show();
		
		cage.dequeue();
		cage.show();

	}

}
