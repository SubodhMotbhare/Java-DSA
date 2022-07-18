public class insertionSort {
    public static void main(String s[]){
        int arr[] = {12, 11 , 13, 5, 6};

        for(int i = 0; i< arr.length; i++){
            int current = arr[i]; //assign the first element in sorted part
            int j = i-1;
            while(j>= 0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
    }

}
