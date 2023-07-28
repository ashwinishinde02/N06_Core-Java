//program to demonstrate on Encapsulation
/*Encapsulation achieve a data hiding using private access
 *specifier*/
package org.tnsif.encapsulation;

import java.util.Objects;

public class HDFC {
	
	//private data members
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinNo;
	
	@Override
	public int hashCode() {
		return Objects.hash(accType, accountNo, atmCardNo, pinNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HDFC other = (HDFC) obj;
		return Objects.equals(accType, other.accType) && accountNo == other.accountNo && atmCardNo == other.atmCardNo
				&& pinNo == other.pinNo;
	}
	//getter and setter method
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ "]";
	}
	
	

}
