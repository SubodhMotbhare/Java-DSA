import java.util.Scanner;

//next() takes only single word
//nextLine() takes the line with spaces

public class stringExample {
	public static void main(String s[]) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name = ");
		name = sc.nextLine();
		System.out.println("Name : " + name);
	}
}
