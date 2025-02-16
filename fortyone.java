import java.util.*;
public class fortyone{  
    
    public static void main(String args[]){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of m:");
        int m = sc.nextInt();
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int matrix[][] = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter value of matrix ["+i+"]["+j+"] :");
                matrix[i][j]=sc.nextInt();
            }
        }
        int rowstart=0;
        int columnstart=0;
        int rowend=n-1;
        int columnend=m-1;
        
        while (rowstart <= rowend && columnstart <= columnend) {
            for (int i = columnstart; i <= columnend; i++) {
                System.err.print(matrix[rowstart][i]+" ");
            }
            rowstart++;
            for (int i = rowstart; i <= rowend; i++) {
                System.err.print(matrix[i][columnend]+" ");
            }
            columnend--;
            for (int i = columnend; i >= columnstart; i--) {
                System.err.print(matrix[rowend][i]+" ");
            }
            rowend--;
            for (int i = rowend; i >= rowstart; i--) {
                System.err.print(matrix[i][columnstart]+" ");
            }
            columnstart++;
        }
    }
}