package org.tnsif.encapsulation;
public class EncapsulationExcutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("Saving Accout");
		h.setAccountNo(347635729L);
		h.setAtmCardNo(44577564546678L);
		h.setPinNo(11221);
		
		//System.out.println("Account No.is:"+h.getAccountNo();
		//below line will call to toString() method
		System.out.println(h);
		

	}

}
