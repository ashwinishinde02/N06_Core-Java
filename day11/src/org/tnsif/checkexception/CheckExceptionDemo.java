package org.tnsif.checkexception;
import java.io.FileInputStream;
class CheckExceptionDemo {

	public static void main(String[] args) {
		try 
		{
			FileInputStream f=new FileInputStream("C:\\Users\\Ashwini\\Downloads\\Hello.txt");
			System.out.println("File is exists!!");
		
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
		

	}
 

}
