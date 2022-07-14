//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class oddNum {
	public static void calculateOdd(int num) {
		int sumOdd = 0;
		for(int i = 1; i<=num; i++) {
			if(!(i%2==0)) {
				 sumOdd = sumOdd+i;
			}
		}
		System.out.println("The sum of 1 to "+ num +" Odd No is "+ sumOdd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no from which to calculate the sum of odd no = ");
		int num = sc.nextInt();
		
		calculateOdd( num);
	}

}
