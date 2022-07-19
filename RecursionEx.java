public class RecursionEx {

    public static void printNum(int n) {
        if (n == 0) { /*if n==0 then it return to the previous step */
            return;
        }
        System.out.println(n);
        printNum(n - 1); // recursion occur
    }

    public static void main(String s[]) {
        int n = 7;

        printNum(n);
    }
}
