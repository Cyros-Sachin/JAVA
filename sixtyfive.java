public class sixtyfive {
    public static void merger(int arr[],int si,int ei,int mid) {
        int cpy_arr[] = new int[ei-si + 1];

        int idx1=si;
        int idx2=mid+1;
        int idxm=0;
        while (idx1<=mid && idx2 <= ei) {
            if (arr[idx1] <=arr[idx2]) {
                cpy_arr[idxm++]=arr[idx1++];
            }
            else{
                cpy_arr[idxm++]=arr[idx2++];
            }
        }
        while (idx1<=mid) {
            cpy_arr[idxm++]=arr[idx1++];
        }
        while (idx2<=ei) {
            cpy_arr[idxm++]=arr[idx2++];
        }

        for (int i = 0,j=si; i < cpy_arr.length; i++,j++) {
            arr[j]=cpy_arr[i];
        }
    }

    public static void merged_sort(int[] arr , int si , int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        merged_sort(arr, si, mid);
        merged_sort(arr, mid+1, ei);
        merger(arr,si,ei,mid);
    }
    public static void main(String[] args) {
        int num []= {8,7,2,1,4,5,6,3,9};
        int n = num.length;
        merged_sort(num,0,n-1);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
