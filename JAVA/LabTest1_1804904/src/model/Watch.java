//Kyle Parris
//1804904

package model;

import java.io.Serializable;

public class Watch implements Serializable{
	private String soa;
	private String material;
	private String brand;
	private double price;
	
	public Watch() {
		this.soa = "";
		this.material = "";
		this.brand = "";
		this.price = 0.00;
	}
	
	public Watch(String soa, String material, String brand, double price) {
		this.soa = soa;
		this.material = material;
		this.brand = brand;
		this.price = price;
	}
	
	public Watch(Watch watch) {
		this.soa = watch.soa;
		this.material = watch.material;
		this.brand = watch.brand;
		this.price = watch.price;
	}

	public String getSoa() {
		return soa;
	}

	public void setSoa(String soa) {
		this.soa = soa;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SOA Number: " + soa + "\nMaterial: " + material + "\nBrand: " + brand + "\nPrice: $" + price + "\n";
	}
		
}
