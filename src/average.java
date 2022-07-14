//Enter 3 numbers from the user & make a function to print their average.



import java.util.*;
public class average {
	public static  void calculateAverage(int num1, int num2, int num3) {
		int average = (num1 + num2 + num3)/3;
		System.out.println("The average of three no is  = "+ average);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter the three numbers = ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		calculateAverage(num1, num2, num3);
	}

}
