import java.util.Scanner;
import java.util.Stack;

public class seventyfour {
    public static void main(String[] args) {
        Stack <Integer> myStack =new Stack<>();
        System.out.println("Enter the size of stack:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the data:");
            int data = sc.nextInt();
            myStack.push(data);
        }
        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter a choice (1:push,2:pop,3:peek,4:Exit)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int item = sc.nextInt();
                    myStack.push(item);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    System.out.println(myStack.peek()); 
                    break;
                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Enter correctly!!\n");
                    break;
            }
        }

    }
}
