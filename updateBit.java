import java.util.*;

public class updateBit {
    public static void main(String s[]){
        int number = 5; //0101
        System.out.println("Initially the no is 0101");
        int position = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the changaing value = ");
        int update = sc.nextInt();
        int bitmask = 1<<position;

        if(update== 0 ){
            int newval = (~bitmask) & number;
            System.out.println(newval);
        }
        else{
            int newval = bitmask | number;
            System.out.println(newval);
        }
    }

}
