public class RecursionEx2 {
    public static void printNum(int n) {
        if (n == 6) {
            return; //base case
        }
        System.out.println(n);
        printNum(n + 1); // recursion occur
    }

    public static void main(String s[]) {
        int n = 1;

        printNum(n);
    }
}
