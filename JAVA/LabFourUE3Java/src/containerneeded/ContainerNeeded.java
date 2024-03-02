package containerneeded;

import java.io.IOException;
import java.util.Scanner;

public class ContainerNeeded {
	
	public void Demonstrate() throws IOException{
		int wholesaleSize;
		int retailSize;
		int numberRetailNeeded;
		char ans;
		
		System.out.println("Now in Demonstrate()");
		
		while (true) {
			wholesaleSize = EnterSizeOfWholesaleContainer();
			retailSize = EnterSizeOfRetailContainer();
			numberRetailNeeded = CalculateRetailContainersNeeded(wholesaleSize, retailSize);
			
			System.out.println("Back in Demonstrate()");
			System.out.println("The number of retail containers needed is" + numberRetailNeeded);
			System.out.println("Perform another calculation? [y/n]");
			ans = ' ';
			while (ans != 'y' && ans !='Y' && ans != 'n' && ans != 'N') ans = (char) System.in.read();
			System.out.println(" ");
			if (ans == 'n' || ans == 'N')
				break;
		}
	}
	
	public int EnterSizeOfWholesaleContainer() {
		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Now in EnterSizeOfWholesaleContainer()");
		System.out.println("Enter the size of the wholesale container - ");
		size = in.nextInt();
		System.out.println(" ");
		return size;
	}
	
	public int EnterSizeOfRetailContainer() {
		Scanner in = new Scanner(System.in);
		int size;
		System.out.println("Now in EnterSizeOfRetailContainer()");
		System.out.println("Enter the size of the retail container - ");
		size = in.nextInt();
		System.out.println(" ");
		return size;
	}
	/*
	public int CalculateRetailContainersNeeded(int wcSize, int rcSize) {
		System.out.println("Now in CalculateRetailContainersNeeded()");
		return wcSize / rcSize;
	}
	
	public int CalculateRetailContainersNeeded(int wcSize, int rcSize) {
		int result = 0;
		System.out.println("Now in CalculateRetailContainersNeeded()");
		try {
			result = wcSize / rcSize;
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		return result;
	}*/
	
	public int CalculateRetailContainersNeeded(int wcSize, int rcSize) throws ArithmeticException {
		System.out.println("Now in CalculateRetailContainersNeeded()");
		return wcSize / rcSize;
	}

}
