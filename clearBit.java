public class clearBit {
    public static void main(String s[]){
        int number = 5;
        int position = 2;
        int bitmask = 1<<2;
        int finalval = (~(bitmask)) & number;
        System.out.println(finalval);
    }

}
