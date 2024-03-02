import java.io.IOException;
import java.util.Scanner;

public class ContainersNeeded {
	
	public void demonstrate() throws IOException{
		int wholesaleSize;
		int retailSize;
		int numberRetailNeeded;
		char ans;
		
		System.out.println("Now in demonstration()");
		
		while (true) {
			wholesaleSize = enterSizeOfWholesaleContainer();
			retailSize = enterSizeOfRetailContainer();
			numberRetailNeeded = calculateRetailContainersNeeded(wholesaleSize, retailSize);
			System.out.println("Back in Demonstrate()");
			System.out.println("The number of retail containers needed is" + numberRetailNeeded);
			System.out.println("Perform another calculation?"+ "[y/n]");
			
			ans = ' ';
			while (ans !='y' && ans != 'Y' && ans != 'n' && ans != 'N' ) {
				ans = (char) System.in.read();
			}
			System.out.println(" ");
			if (ans == 'n' || ans == 'N') {
				break;
			}
		}
	}

	/*ORIGINAL CALCULATERETAILCONTAINERSNEEDED() CODE
	 * public int calculateRetailContainersNeeded(int wholesaleSize, int retailSize) {
		// TODO Auto-generated method stub
		System.out.println("Now in calculateRetailContainersNeeded()");
		return wholesaleSize / retailSize;
	}
	  
	 * IN METHOD EXCEPTION HANDLING
	 * public int calculateRetailContainersNeeded(int wholesaleSize, int retailSize) {
		// TODO Auto-generated method stub
		int size = 0;
		System.out.println("Now in calculateRetailContainersNeeded()");
		try {
			size = wholesaleSize / retailSize;
		} catch(ArithmeticException ax) {
			System.out.println("\n\nDivision by zero is illegal\n\n");
		}
		return size;
	}*/
	
	public int calculateRetailContainersNeeded(int wholesaleSize, int retailSize) throws ArithmeticException{
		// TODO Auto-generated method stub
		System.out.println("Now in calculateRetailContainersNeeded()");
		return wholesaleSize / retailSize;
	}

	public int enterSizeOfRetailContainer() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Now in enterSizeOfRetailContainer()");
		System.out.println("Enter the size of the retail" + "container - ");
		size = in.nextInt();
		System.out.println(" ");
		return size;
	}

	public int enterSizeOfWholesaleContainer() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Now in enterSizeOfWholesaleContainer()");
		System.out.println("Enter the size of the wholesale" + "container - ");
		size = in.nextInt();
		System.out.println(" ");
		return size;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ContainersNeeded X = new ContainersNeeded();
		
		System.out.println("Calling demonstrate() from main()");
		
		X.demonstrate();
		
		System.out.println("Returned from demonsration(), now back in main");

	}

}
