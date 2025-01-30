import java.util.*;
public class thirtytwo{
    public static double circum(int radius){
        return 2*3.14*radius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int radius = sc.nextInt();
        System.out.print("Circumference is:"+circum(radius));
    }
}