import java.util.*;
public class twentyeighth{
    public static void table(int num){
        for(int i = 1; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        
    }
    public static void main(String args[]){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
}