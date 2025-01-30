import java.util.*;
public class thirtyseven{
    public static int fib(int i){
        if(i==1){
            return 0;
        }else if(i==2){
            return 1;
        }
        else{
            return fib(i-2)+fib(i-1);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}