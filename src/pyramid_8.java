
public class pyramid_8 {
	 public static void main(String s[]) {
		 int n=4;
		 for(int i=1; i<=n; i++) {
			 for(int j = 1; j<= i; j++) {
				 System.out.print("*");
			 }
			 
			 //for spaces
			 int spaces = 2*(n-i);
			 for(int j = 1; j<spaces; j++) {
				 System.out.print(" ");
			 }
			 for(int j =1; j<=i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
}
