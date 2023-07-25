//program to demonstrate on default and parameterized constructor
package org.tndif.classandobject;
//class declaration
public class Library 
{
	
	
    //public data members
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	public Library() 
	{
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	public Library(long noOfBook, String authorName, String bookName,double price) {
	}	  
}
