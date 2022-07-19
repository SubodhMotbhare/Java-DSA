public class naturalNoRecursion {
    public static void naturalNoSum(int n, int sum, int i){
        if(i == n ){
            sum = sum+i;
            System.out.println("The sum of natural no is = "+ sum);
            return;
        }
        sum = sum + i;
        naturalNoSum(n, sum, i+1);

    }
    public static void main(String s[]){
        int n = 5;
        int sum = 0;
        int i =1;

        naturalNoSum(n, sum, i);
    }
}
