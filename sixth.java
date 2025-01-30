
import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        do {
            System.out.println("Enter a choice:(1/0)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter marks:");
                    int marks = sc.nextInt();
                    if(marks>=90){
                        System.out.println("This is good");
                    }else if(marks>=60 && marks<=89){
                        System.out.println("This is also good!!");
                    }else{
                        System.out.println("This is good as well!!");
                    }
                }
                case 0 -> {
                    running = false;
                }
                default -> {
                }
            }
        } while (running);
    }
}
