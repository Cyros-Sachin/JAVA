import java.util.*;
public class forty{  
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int check=0;
        int numbers[] = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(j!=n-1 && numbers[j]>numbers[j+1] ){
                break;
            }if(j==n-1){
                check=1;
            } 
        }
        if(check==1){
            System.out.println("Sorted!!");
        }else{
            System.out.println("Not Sorted!!");
        }
    }
}