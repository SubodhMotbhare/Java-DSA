import java.util.Scanner;

public class serachArrayElement {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int size = sc.nextInt();
		int element[] = new int[size];
		for (int i = 0; i < size; i++) {
			element[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to search in array = ");
		int searchElement = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (searchElement == element[i]) {
				System.out.println("Your no is found in given array i.e. = " + searchElement);
			} else {
				System.out.println("Your number is not in the array.");
			}
		}

	}

}
