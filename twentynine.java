import java.util.*;
public class twentynine{
    public static void avg(int num1,int num2,int num3){
            System.out.println((num1+num2+num3)/3);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3:");
        int num3 = sc.nextInt();
        avg(num1,num2,num3);
    }
}