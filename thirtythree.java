import java.util.*;
public class thirtythree{
    public static String check(int age){
        if(age>=18){
            return "Eligible";
        }else{
            return "not Eligible";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("You Are "+check(age));
    }
}