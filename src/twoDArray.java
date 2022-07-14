//Take a matrix as a input from the user. Search a given number x and print its index on console. 

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size =");
		int row = sc.nextInt();
		System.out.println("Enter the column size =");
		int column = sc.nextInt();

		int matrix[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter the no you want to search = ");
		int searchNo = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (searchNo == matrix[i][j]) {
					System.out.println("The index of Searched element index is = " + i + " " + j);
				}
			}
		}
	}

}
