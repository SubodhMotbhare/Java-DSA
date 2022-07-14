import java.util.Scanner;

public class switchcase {
	public static void main(String s[]) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your button no = ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("Button 1 is pressed.");
			break;
				
		case 2 :
			System.out.println("Button 2 is pressed.");
			break;
		
		case 3 :
			System.out.println("Button 3 is pressed");
			break;
			
		default:
			System.out.println("Wrong Choices");
				
		}
	}
}
