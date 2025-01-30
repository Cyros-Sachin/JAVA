import java.util.*;
public class thirtyone{
    public static void check(int num,int num1){
        if(num>num1){
            System.out.print(num);
        }else{
            System.out.print(num1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        System.out.print("Enter number:");
        int num1 = sc.nextInt();
        check(num,num1);
    }
}