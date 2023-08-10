package org.tnsif.singledimensionarray;

import java.util.Arrays;
import java.util.Scanner;

//program to demonstrate on array using runtime input values
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the total no. of element");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		
		
		
	
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for (int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest element is:"+max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are:");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
	

}
