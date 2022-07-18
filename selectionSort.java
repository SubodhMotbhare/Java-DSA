public class selectionSort {
    public static void print(int arr[]){
    for(int i = 0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String s[]){
        int temp,small;
        int arr[] = {12, 29, 25, 8, 32, 17, 40};

        for(int i = 0; i< arr.length; i++ ){
            small = i;
            for(int j = i+1; j<arr.length; j++ ){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            temp = arr[small];
           arr[small] = arr[i];
            arr[i] = temp;

        }

        print(arr);


    }

}
