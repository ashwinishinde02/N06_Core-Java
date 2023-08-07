package org.tnsif.InterfaceDemo;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate an interface
		//Sony s=new Sony();
		
		SonyTV obj=new SonyTV();
		obj.display();
		obj.show();
		Sony.accept();
		
		ISRO i=new ISRO();
		i.status();
	}

}
