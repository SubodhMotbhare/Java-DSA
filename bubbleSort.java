import java.util.Scanner;

public class bubbleSort {
    public static void main(String s[]){
       // int arr[] = {13, 32, 26, 35, 10, 1};
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the array elelment =");
       int size = sc.nextInt(); //the no of elements
       int arr[] = new int[size];// pass the size to array
       for(int i =0; i< size; i++){
         arr[i] = sc.nextInt(); //take the values
       }



        for(int i = 0; i<size-1; i++){ //for counter
            for(int j = 0; j<size-1; j++){ //for values
                if(arr[j]>arr[j+1]){ //checks the front is greater than back
                    int temp = arr[j]; // swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array is = ");
        for(int i =0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
    }


}
