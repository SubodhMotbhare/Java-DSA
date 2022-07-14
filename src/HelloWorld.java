
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
	public void simple() {
    int factorial;
    int finalval =1;
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no for calculating the factorial = ");
    factorial = sc.nextInt();
    
    	
    for(int i = factorial; i>=1; i--)
    {
    finalval = finalval*i;
    }
    
    System.out.println("The factorial is = "+finalval);
	}
    public static void main(String args[]) {
        HelloWorld h = new HelloWorld();
        h.simple();
    }
}