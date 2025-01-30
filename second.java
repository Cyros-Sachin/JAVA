
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        System.out.print("Enter the number to find the table of");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
