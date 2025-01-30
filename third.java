
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!!");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("1:Add\n2:Sub\n3:Mul\n4:Div\n5:Modulo\n");
        System.out.println("Enter a choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a*b);
            case 4 -> System.out.println(a/b);
            case 5 -> System.out.println(a%b);
            default -> System.out.println("Invalid Input!!");
        }
    }
}
