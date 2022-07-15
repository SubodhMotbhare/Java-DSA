
public class bit {
     public static void main(String[] args) {
        int number = 5;
        int pos = 3;
        int bitmask = 1<<pos;
        if((bitmask & number) == 0 ){
            System.out.println("The bit is 0");
        }
        else{
            System.out.println("The bit is 1");
        }
    }

}
