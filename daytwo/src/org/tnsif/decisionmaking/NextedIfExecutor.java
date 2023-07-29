//program to demonstrate on bunjee jumping usinf nested if 
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NextedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			System.out.println("Eligible for bunjee juumping");
		}
		if(weight>=40)
		{
	    if(weight>110)
		
		{
			System.out.println("Extra ropes will be added");
		}
		}
		else
		{
			System.out.println("Not eligible");
		}

	}
	    
	{
		System.out.println("not eligible");
	}

}

