import java.util.*;
public class thirtysix{
    public static void gcd(int big,int small){
        int res=1;
        for(int i = 1; i<=small;i++){
            if(big%i==0 && small%i==0){
                res=i;
            }
        }
        System.out.print("GCD is:"+res);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int num2 = sc.nextInt();
        if(num1>num2){
            gcd(num1,num2);
        }else{
            gcd(num2,num1);
        }
    }
}