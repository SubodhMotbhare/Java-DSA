import java.util.Scanner;

public class stringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("What are you doing?");
		StringBuilder sb2 = new StringBuilder(100);
		Scanner sc = new Scanner(System.in);
		// sb = sc.nextLine();

		System.out.println(sb + "   " + sb.length());
		System.out.println(sb1.length());
		System.out.println(sb2.length());

	}

}
