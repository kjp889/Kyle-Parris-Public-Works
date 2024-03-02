package LabTest2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		
		Product pro; //= //new Product();
		//pro.display();
		//showProductRecord(pro);
		
		//pro = new InkCartridge();
		//pro.display();
		//showProductRecord(pro);
		
		pro = new PlyBoard();
		//pro.display();
		showProductRecord(pro);

	}

	public static void showProductRecord(Product product) {
		System.out.println(product.toString());
		product.display();
	}
	
	public boolean saveProductRecord(InkCartridge ink) {
		try {
			FileWriter outFileWriter = new FileWriter(new File("inkStock.dat"), true);
			String record = ink.code + "\t" + ink.name + "\t" + ink.unitCost + 
					"\t" + ink.getColour() + "\t" + ink.getWeight() + "\t" + ink.getFluidOunce() ;
			outFileWriter.write(record);
			outFileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean saveProductRecord(PlyBoard ply) {
		try {
			FileWriter outFileWriter = new FileWriter(new File("plyStock.dat"), true);
			String record = ply.code + "\t" + ply.name + "\t" + ply.unitCost + 
					"\t" + ply.getLength() + "\t" + ply.getWidth() + "\t" + ply.getThickness() ;
			outFileWriter.write(record);
			outFileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
