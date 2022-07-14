import java.util.*;

public class sumFunction {
	
	public static int sumCalculate(int a, int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two integer value = ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = sumCalculate(a,b);
		System.out.println(sum);
	}

}
