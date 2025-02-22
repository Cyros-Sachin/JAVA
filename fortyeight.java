public class fortyeight {
    public static void main(String[] args) {
        int arr[] ={7,6,4,8,2,1,3,5};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
    }
}
