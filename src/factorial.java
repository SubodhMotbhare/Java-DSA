import java.util.Scanner;

public class factorial {
	
	public static void fcatorialCalculation(int factNum) {
		int factorial = 1;
		if(factNum < 0) {
			System.out.println("We can't calculate the factorial of Negative Numbers.");
		}
		else {
			for(int i = factNum; i>=1; i--) {
				factorial = factorial*i;
			}
		}
		
		System.out.println("Factorial of "+factNum+ " is "+ factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for calculate the Factorial = ");
		int factNum = sc.nextInt();
		fcatorialCalculation(factNum);
		
		
	}

}
