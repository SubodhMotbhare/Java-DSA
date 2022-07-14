// hollow pattern program

public class hollow_pattern {
	public static void main(String s[]) {
		int a = 5;
		int b = 6;
		int i,j;
		for(i=1; i<=a; i++) {
			for(j=1; j<=b; j++) {
				if(i==1 || i==a || j==1 || j==b) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
