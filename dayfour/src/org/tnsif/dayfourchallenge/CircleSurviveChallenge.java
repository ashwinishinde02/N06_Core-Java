/*There are n people standing in a circle waiting to be executed. 
 * The counting out begins at some point of circle and
 * proceeds around the circle in a fix direction.
 * If each step a certain no. of people are skipped 
 * and the person is executed.
 * The elimination proceeds around the circle in the
 * which is the smaller and smaller as the executed people are removed
 * until only the last person remains,who is given freedom
 * given the total no of person and a number k which indicate that k-1 person are skipped
 * person are skipped
 * and the kth person is killed in the circle
 * the task is to choose to person in the initial circle that survive*/

package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {

	static int survive(int n,int k)
	{
	   if(n==1)
		   return 1;
	   else
		   return (survive(n-1,k)+k-1)%n+1;
	 
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for n and k:");
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
