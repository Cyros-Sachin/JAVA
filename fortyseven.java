public class fortyseven {
    public static void main(String[] args) {
        int arr[] ={7,6,4,8,2,1,3,5};
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for(int j = i; j < arr.length-1;j++){
                if (arr[min]>arr[j+1]) {
                    min=j+1;
                }
            }
            if (arr[i]>arr[min]) {
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
    }
}
