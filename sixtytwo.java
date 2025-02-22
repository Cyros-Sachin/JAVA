import java.util.ArrayList;

public class sixtytwo {

    public static void printarray(ArrayList <Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.err.print(subset.get(i));
        }
        System.err.println();
    }

    public static void totalsubsets(ArrayList <Integer> subset , int n) {
        
        if (n==0) {
            printarray(subset);
            return;
        }
        subset.add(n);
        totalsubsets(subset, n-1);

        subset.remove(subset.size()-1);
        totalsubsets(subset, n-1);
    }
    public static void main(String[] args) {
        ArrayList <Integer> subset = new ArrayList<>();
        totalsubsets(subset,3);
    }
}
