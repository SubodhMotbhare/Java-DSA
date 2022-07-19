//x^n calculate the power by using recursion
public class powerCalRecursion {
    public static int calculatePower(int n, int x){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int powerN_1 = calculatePower(n-1, x);//this calculation done by using recursion in stack
        int powerN = powerN_1*x;
        return powerN;
    }
   public static void main(String[] args) {
        int n = 4;
        int x = 2;

        int ans = calculatePower(n,x);
        System.out.println(ans);
    }

}
