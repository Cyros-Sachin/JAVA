import java.util.*;
public class twentyseventh{
    public static void check_Even(int num){
        if(num%2==0){
            System.out.print("Even!");
            return;
        }
        System.out.print("Odd!");
        return;
        
    }
    public static void main(String args[]){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check_Even(num);
    }
}