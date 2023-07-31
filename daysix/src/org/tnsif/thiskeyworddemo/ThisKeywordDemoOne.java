//program to demonstrate on:
//this keyword is used to refer current instance of the class

package org.tnsif.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}

void display()
{
	System.out.println(accountNo);
}
}
//driver class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a=new Account();
		//a.accountNo=6846727894L;
		a.setData(675758768L);
		a.display();
		

	}

}
