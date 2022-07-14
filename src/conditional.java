import java.util.Scanner;

public class conditional {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the value of a and b = ");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b) {
			System.out.println("A is Greater Than B");
		}
		else {
			if(a<b) {
				System.out.println("B is Greater Than A");
				
			}
			else {
				System.out.println("A equal B");
			}
		}
	}
}
