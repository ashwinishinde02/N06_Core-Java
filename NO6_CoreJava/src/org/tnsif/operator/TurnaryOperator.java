//program to demonstrate on Ternary Operator 
package org.tnsif.operator;

import java.util.Scanner;

public class TurnaryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=(num%2==0)?"Even":"odd";
		System.out.println("Result is:"+result);
		s.close();
	}

}
