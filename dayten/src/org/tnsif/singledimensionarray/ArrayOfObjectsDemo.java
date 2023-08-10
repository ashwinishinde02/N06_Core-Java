package org.tnsif.singledimensionarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Employees arr[]=new Employees[3];
		arr[0]=new Employees(101,"Saish",50000.95);
		arr[1]=new Employees(102,"Ashwini",80000.75);
		arr[2]=new Employees(103,"Sakshi",30000.43);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+ " "+arr[i].getName()+""+arr[i].getSalary());
		}

	}

}
