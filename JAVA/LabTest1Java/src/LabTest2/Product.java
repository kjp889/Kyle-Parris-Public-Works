package LabTest2;

public class Product {
	protected int code;
	protected String name;
	protected float unitCost;
	
	public Product() {
		this.code = 0;
		this.name = "name";
		this.unitCost = (float) 0.0;
	}
	
	public Product(int code, String name, float unitCost) {
		this.code = code;
		this.name = name;
		this.unitCost = unitCost;
	}
	
	public Product(Product product) {
		this.code = product.code;
		this.name = product.name;
		this.unitCost = product.unitCost;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}

	public String toString() {
		return "Code: " + code + "\nName: " + name + "\nUnit Cost: $" + unitCost;
	}
	
	public void display() {
		System.out.println(this.toString());
	}
	
	

}
