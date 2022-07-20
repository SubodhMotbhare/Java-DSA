// Find the occurrence of the first and last occurrence of an element using recursion.
/**
 * occuranceOfString
 */
public class occuranceOfString {
    public static int first = -1;
    public static int last = -1;

    static void findOccurance(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (element == str.charAt(idx)) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "aancbhauaabsha";
        char element = 'a';
        findOccurance(str, 0, element);
    }
}