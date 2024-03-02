package domain;

import java.io.Serializable;

public class Car implements Serializable{
	private double cost;
	private String model;
	private String carID;
	
	public Car() {
		this.cost = 0;
		this.model = "";
		this.carID = "";
	}
	
	public Car(double cost, String model, String carID) {
		this.cost = cost;
		this.model = model;
		this.carID = carID;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
		this.carID = carID;
	}

	@Override
	public String toString() {
		return "Cost=" + cost + "\nModel=" + model + "\nLicense Plate=" + carID ;
	}
	
	
}
