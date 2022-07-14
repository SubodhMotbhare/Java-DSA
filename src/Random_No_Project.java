import java.util.Scanner;

public class Random_No_Project {
	public static void main(String s[]) {
		int userno;
		int randomno = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Guess the number between 1 to 100 = ");
			userno = sc.nextInt();
			
			if(randomno == userno) {
				System.out.println("The number is Equal");
				break;
			}
			else if(randomno > userno) {
				System.out.println("The random no is too large");
				System.out.println("");
			}
			else {
				System.out.println("The random no is too small");
				System.out.println("");
			}
		}while(randomno>0);
		
		System.out.println("The random no is = "+randomno);
	}

}
