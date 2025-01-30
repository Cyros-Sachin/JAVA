import java.util.*;
public class twentysixth{
    public static void check_prime(int num){
        for(int i=1; i<num;i++){
            if(num%i==0 && i!=1){
                System.out.print("Not Prime!");
                return;
            }
        }
        System.out.print("Prime!");
        return;
        
    }
    public static void main(String args[]){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check_prime(num);
    }
}