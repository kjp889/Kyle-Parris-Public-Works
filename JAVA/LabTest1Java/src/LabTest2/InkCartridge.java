package LabTest2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InkCartridge extends Product {
	private String colour;
	private float weight;
	private float fluidOunce;
	
	public InkCartridge() {
		super();
		this.colour = "colour";
		this.weight = (float) 0.0;
		this.fluidOunce = (float) 0.0;
	}
	
	public InkCartridge(int code, String name, float unitCost,
		String colour, float weight, float fluidOunce) {
		this.code = code;
		this.name = name;
		this.unitCost = unitCost;
		this.colour = colour;
		this.weight = weight;
		this.fluidOunce = fluidOunce;
	}
	
	public InkCartridge(InkCartridge cartridge) {
		this.code = cartridge.code;
		this.name = cartridge.name;
		this.unitCost = cartridge.unitCost;
		this.colour = cartridge.colour;
		this.weight = cartridge.weight;
		this.fluidOunce = cartridge.fluidOunce;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getFluidOunce() {
		return fluidOunce;
	}

	public void setFluidOunce(float fluidOunce) {
		this.fluidOunce = fluidOunce;
	}

	public String toString() {
		return super.toString() + "\nColour: " + colour + "\nWeight: " + weight + "\nFluid Ounce: " + fluidOunce;
	}
	
	public void display() {
		System.out.println(this.toString());
	}
	
	public boolean saveProductRecord(PlyBoard ply) {
		try {
			FileWriter outFileWriter = new FileWriter(new File("inkStock.dat"), true);
			String record = code + "\t" + name + "\t" + unitCost + 
					"\t" + colour + "\t" + weight + "\t" + fluidOunce ;
			outFileWriter.write(record);
			outFileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
