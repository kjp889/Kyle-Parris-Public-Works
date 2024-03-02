package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StockItem {
	private int partNumber;
	private String description;
	private double price;
	
	public StockItem() {
		this.partNumber = 0;
		this.description = "";
		this.price = 0.0;
	}
	
	public StockItem(int partNumber, String description, double price) {
		this.partNumber = partNumber;
		this.description = description;
		this.price = price;
	}
	
	public void displayStockItem() {
		System.out.println("Part Number: " + partNumber);
		System.out.println("Description: " + description);
		System.out.println("Price: $" + price);
	}
	
	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  partNumber + "\t" + price + "\t" + description ;
	}
	
	//RANDOM ACCESS FILE PROCESSING
	public void createAndInitializeFile() {
		int max = 100;
		StockItem item = new StockItem();
		
		try {
			RandomAccessFile rafPointer = new RandomAccessFile(new File("StockItem.dat"),"rw");
			for (int index = 1; index <= max; index++) {
				rafPointer.seek((index - 1) * (4 + 60 + 8));
				
				rafPointer.writeInt(item.getPartNumber());
				rafPointer.writeUTF(item.getDescription());
				rafPointer.writeDouble(item.getPrice());
			}
			rafPointer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void getStockItemFromUser() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter Part Number of item:");
			this.partNumber = input.nextInt();
			input = new Scanner(System.in);
			System.out.print("Enter Description: ");
			this.description = input.nextLine();
			System.out.print("Enter Price: ");
			this.price = input.nextDouble();
		//	input.close();
		} catch (InputMismatchException e) {
			System.err.println("Invalid data type");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void saveStockItemToFile() {
		try {
			RandomAccessFile rafPointer = new RandomAccessFile(new File("StockItem.dat"),"rw");
			rafPointer.seek(((int) partNumber - 1) * (4 + 60 + 8));
			
			rafPointer.writeInt(partNumber);
			rafPointer.writeUTF(description);
			rafPointer.writeDouble(price);
			rafPointer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void retrieveStockItem() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter part number: ");
		int searchPartNumber = input.nextInt();
		try {
			RandomAccessFile rafPointer = new RandomAccessFile(new File("StockItem.dat"),"r");
			rafPointer.seek(((int) searchPartNumber - 1) * (4 + 60 + 8));
			
			this.partNumber = rafPointer.readInt();
			this.description = rafPointer.readUTF();
			this.price = rafPointer.readDouble();
			rafPointer.close();
			
			if (partNumber != searchPartNumber) {
				System.out.println("ITem not found");
			}
			displayStockItem();
			//input.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/* SEQUENTIAL ACCESS FILE PROCESSING
	public void getStockItemFromUser() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter Part Number of item:");
			partNumber = input.nextInt();
			System.out.print("Enter Price: ");
			price = input.nextDouble();
			input = new Scanner(System.in);
			System.out.print("Enter Description: ");
			description = input.nextLine();
			//input.close();
		} catch (InputMismatchException e) {
			System.err.println("Invalid data type");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
	public void saveStockItemToFile() {
		try {
			FileWriter outFileWriter = new FileWriter(new File("./src/StockItem.txt"), true);
			String stockItemRecord = partNumber + "\t" + price + "\t" + description + "\n";
			outFileWriter.write(stockItemRecord);
			outFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void retrieveStockItem() {
		int searchPartNumber = 0;
		Scanner input = null;
		Scanner inFileReader = null;
		try {
			input = new Scanner(System.in);
			inFileReader = new Scanner(new File("./src/StockItem.txt"));
			System.out.print("Enter the Part Number to search for: ");
			searchPartNumber = input.nextInt();		
			while (inFileReader.hasNext()) {
				this.partNumber = inFileReader.nextInt();
				this.price = inFileReader.nextDouble();
				this.description = inFileReader.nextLine();
				if (this.partNumber == searchPartNumber) {
					//displayStockItem();
					return;
				}				
			}
			System.out.println("Item was not found");
			this.partNumber = 0;
			this.description = " ";
			this.price = 0.0;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
	
	public void displayAllItems() {
		Scanner inFileReader = null;
		System.out.println("Part Number \t Price \t Description");
		System.out.println("------------ \t ----------- \t ----------");
		try {
			inFileReader = new Scanner(new File("./src/StockItem.txt"));	
			while (inFileReader.hasNext()) {
				this.partNumber = inFileReader.nextInt();
				this.price = inFileReader.nextDouble();
				this.description = inFileReader.nextLine();
				System.out.println(toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
	
	public int retrievePrice() {
		int searchPartNumber = 0;
		Scanner input = null;
		Scanner inFileReader = null;
		try {
			input = new Scanner(System.in);
			inFileReader = new Scanner(new File("./src/StockItem.txt"));
			System.out.print("Enter the Part Number to search for: ");
			searchPartNumber = input.nextInt();		
			while (inFileReader.hasNext()) {
				this.partNumber = inFileReader.nextInt();
				this.price = inFileReader.nextDouble();
				this.description = inFileReader.nextLine();
				if (this.partNumber == searchPartNumber) {
					System.out.println("Price is: $" + price);
					return -1;
				}
			}
			System.out.println("Item was not found");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int retrieveDescription() {
		int searchPartNumber = 0;
		Scanner input = null;
		Scanner inFileReader = null;
		try {
			input = new Scanner(System.in);
			inFileReader = new Scanner(new File("./src/StockItem.txt"));
			System.out.print("Enter the Part Number to search for: ");
			searchPartNumber = input.nextInt();		
			while (inFileReader.hasNext()) {
				this.partNumber = inFileReader.nextInt();
				this.price = inFileReader.nextDouble();
				this.description = inFileReader.nextLine();
				if (this.partNumber == searchPartNumber) {
					System.out.println("Item is:" + description);
					return -1;
				}
			}
			System.out.println("Item was not found");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		return -1;
	}*/
	
}
