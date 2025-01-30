import java.util.*;
public class thirty{
    public static void sum_odd(int num){
        int sum=0;
        for(int i=1;i<=num;i+=2){
            sum+=i;
        }
        System.out.println(sum);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        sum_odd(num);
    }
}