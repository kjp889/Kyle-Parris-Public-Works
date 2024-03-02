package domain;

import java.io.Serializable;

public class Customer implements Serializable{
	private int trn;
	private String cusName;
	
	public Customer(int trn, String cusName) {
		this.trn = trn;
		this.cusName = cusName;
	}
	
	public int getTrn() {
		return trn;
	}
	public void setTrn(int trn) {
		this.trn = trn;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	@Override
	public String toString() {
		return "TRN=" + trn + "\nCustomer Name" + cusName;
	}
	
}
