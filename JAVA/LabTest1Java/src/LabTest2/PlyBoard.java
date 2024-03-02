package LabTest2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlyBoard extends Product{
	private float length;
	private float width;
	private float thickness;
	
	public PlyBoard() {
		super();
		this.length = (float) 0.0;
		this.width = (float) 0.0;
		this.thickness = (float) 0.0;
	}
	
	public PlyBoard(int code, String name, float unitCost,
		float length, float width, float thickness) {
		this.code = code;
		this.name = name;
		this.unitCost = unitCost;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
	}
		
	public PlyBoard(PlyBoard ply) {
		this.code = ply.code;
		this.name = ply.name;
		this.unitCost = ply.unitCost;
		this.length = ply.length;
		this.width = ply.width;
		this.thickness = ply.thickness;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	public String toString() {
		return super.toString() + "\nLength: " + length + "\nWidth: " + width + "\nThickness: " + thickness ;
	}
	
	public void display() {
		System.out.println(this.toString());
	}
	
	public boolean saveProductRecord(PlyBoard ply) {
		try {
			FileWriter outFileWriter = new FileWriter(new File("plyStock.dat"), true);
			String record = code + "\t" + name + "\t" + unitCost + 
					"\t" + length + "\t" + width + "\t" + thickness ;
			outFileWriter.write(record);
			outFileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
