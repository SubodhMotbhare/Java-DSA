//backtracking permutation program
// arrange ABC in all possible wayss

public class backtracking {
    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newChar = str.substring(0, i) + str.substring(i+1);
            printPermutation(newChar, perm+current, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }

}
