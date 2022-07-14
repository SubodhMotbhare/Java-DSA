//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.Scanner;

public class fibonacciSeries {

	public static void fabonacciCalculate(int Num) {
		int sum = 0;
		for (int i = 0; i <= Num; i++) {
			sum = sum + i;
		}
		System.out.println("fabonacci of " + Num + " is" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate the fabonacci = ");
		int Num = sc.nextInt();

		fabonacciCalculate(Num);
	}

}
