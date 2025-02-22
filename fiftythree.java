public class fiftythree {
    public static void check_arr(int arr[],int a,int b) {
        if (b>=arr.length) {
            System.err.println("Sorted !!");
            return;
        }
        if (arr[a]>arr[b]) {
            System.err.println(" NOT Sorted !!");
            return;  
        }
        check_arr(arr, a+1, b+1);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6,5,7};
        check_arr(arr,0,1);
    }
}
