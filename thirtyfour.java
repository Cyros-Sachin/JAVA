import java.util.*;
public class thirtyfour{
    public static void main(String args[]){
        int pos=0;
        int neg=0;
        int zero=0;
        int check=1;
        boolean choice = true;
        Scanner sc = new Scanner(System.in);
        while(choice){
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            if(num>0){
                pos++;
            }else if(num<0){
                neg++;
            }else{
                zero++;
            }
            System.out.print("Want to continue?(Yes:1 ,No:0):");
            check = sc.nextInt();
            if(check==0){
                choice = false;
            }
        }
        System.out.println("POSITIVE:"+pos);
        System.out.println("NEGATIVE:"+neg);
        System.out.println("ZERO:"+zero);
    }
}