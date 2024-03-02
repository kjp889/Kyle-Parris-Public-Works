package domain;

import java.io.Serializable;

public class Login implements Serializable{
	private String userName;
	private String pwrd;
	private String type;
	
	public Login() {
		this.userName = "";
		this.pwrd = "";
		this.type = "";
	}
		
	public Login(String userName, String pwrd) {
		this.userName = userName;
		this.pwrd = pwrd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwrd() {
		return pwrd;
	}

	public void setPwrd(String pwrd) {
		this.pwrd = pwrd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}