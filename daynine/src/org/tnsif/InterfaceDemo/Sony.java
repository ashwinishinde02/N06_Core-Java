package org.tnsif.InterfaceDemo;
//program to demonstrate on interface
public interface Sony {
	/*by default all the variables inside an interface
	 * is public static final*/
	int noOfChannels=6;
	//by abstract method inside an interface is an abstract method
	void display();
	/*java 8 provides a static and default method inside an interface*/
	//static method
	static void accept()
	{
		System.out.println("Static method");
	}
	default void show()
	{
		System.out.println("Default method");
	}
  
}
