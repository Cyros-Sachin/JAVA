import java.util.*;
public class thirtyfive{
    public static int power(int x,int n){
        int res=1;
        for(int i =1; i<=n;i++){
            res*=x;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X:");
        int x = sc.nextInt();
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        System.out.print("Answer is:"+power(x,n));
    }
}