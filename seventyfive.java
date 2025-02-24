import java.util.ArrayList;
import java.util.Scanner;

public class seventyfive {

    static class Stack {
        ArrayList<Integer> mystack =new ArrayList<>();

        public void push(int data) {
            mystack.add(data);
        }

        public void peek() {
            System.out.println(mystack.get(mystack.size()-1));
        }

        public void viewstack() {
            if (mystack.size()==0) {
                System.out.println("Empty");
                return;
            }
            for (int i = 0; i < mystack.size(); i++) {
                System.out.print(mystack.get(i)+" ");
            }
        }

        public void pop() {
            if (mystack.size()==0) {
                System.out.println("Underflow!!");
                return;
            }
            mystack.removeLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Enter the size of stack:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the data:");
            int data = sc.nextInt();
            stack.push(data);
        }
        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter a choice (1:push,2:pop,3:peek,4:view,5:Exit)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.viewstack();
                    break;
                case 5:
                    flag=false;
                    break;

                default:
                    System.out.println("Enter correctly!!\n");
                    break;
            }
        }

    }
}
