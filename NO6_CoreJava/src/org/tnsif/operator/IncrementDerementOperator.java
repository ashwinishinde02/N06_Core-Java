package org.tnsif.operator;

public class IncrementDerementOperator {

	public static void main(String[] args) {
		int x=23,y=6;
		int resl=x++ + ++y;
		System.out.println(resl);
		System.out.println(x); 
		System.out.println(y); 
		System.out.println("Result2");
		int res2=x-- + --y;
		System.out.println(res2);
		System.out.println(x); 
		System.out.println(y);
	}

}
