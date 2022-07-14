
//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class greaterNum {
	public static void greaterNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " Greater than " + num2);
		} else {
			System.out.println(num1 + " Less than " + num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no = ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		greaterNum(num1, num2);
	}

}
