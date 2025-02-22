public class sixtysix {
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = ei;
        int j = -1;
        int temp1;
        for (int i = 0; i <= pivot; i++) {
            if (arr[pivot] >= arr[i] || i==pivot) {
                j++;
                if (arr[j] >= arr[pivot] || i==pivot) {
                    temp1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp1;
                } else {
                    arr[j] = arr[i];
                }
            }
        }
        quicksort(arr, si, j-1);
        quicksort(arr, j+1, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 7, 2, 1, 6, 8, 4 };
        int n = arr.length;

        quicksort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
