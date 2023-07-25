//driver class

package org.tndif.classandobject;
public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empID=132981;
		e.empName="Ashwini Shinde";
		e.salary=78000;
		e.department="IT";
		//method call
		e.display();
		

	}

}
