import java.util.Scanner;

public class arrayEx {
	public static void main(String s[]) {
		int price[] = { 10, 20, 30, 40 };// 1. array decleration
		int marks[] = new int[10]; // 2. array decleration

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size = ");
		int size = sc.nextInt();

		int student[] = new int[size]; // 3. array decleration

		for (int i = 0; i < size; i++) {
			student[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println(student[i]);
		}

	}
}
