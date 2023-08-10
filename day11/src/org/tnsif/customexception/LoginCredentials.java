package org.tnsif.customexception;
//program to demonstrate on custom exception
public class LoginCredentials extends Exception{
	
	private String str;
	
	

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	

		

}
