import java.util.Scanner;

public class seventh {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if (n%i==0) {
                System.out.println("Not Prime!!");
                break;
            }else{
                System.out.println("Prime!!");
                break;
            }
        }
    }
}
