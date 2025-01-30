import java.util.*;
public class thirtynine{  
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for(int i=1;i<n;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("MAX:"+max+"\nMIN:"+min);
    }
}