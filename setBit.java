public class setBit {
    public static void main(String s[]){
        int number = 5;
        int position = 1;

        int bitmask = 1<<position;
        int newNumber = bitmask | number;
        System.out.println(newNumber);
    }

}
