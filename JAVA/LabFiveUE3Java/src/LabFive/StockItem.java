package LabFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
	}

	@Override
	public String toString() {
		return  partNumber + "\t" + price + "\t" + description ;
	}

}
