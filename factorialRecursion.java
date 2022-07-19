//find the factorial for given number by using recursion.

public class factorialRecursion {
    public static int  factorialCal(int n){
        if(n==1 || n == 0){
            return 1;
        }
       int fact = factorialCal(n-1);
       int factAll = fact *n;
        return factAll;
       // int facAll = fact * n;
    }
     public static void main(String[] args) {
        int n = 3;
        int ans = factorialCal(n);
        System.out.println(ans);
    }
}
