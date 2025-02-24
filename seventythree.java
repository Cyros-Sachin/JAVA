import java.util.Scanner;

public class seventythree {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            return;
        }

        public void peek() {
            if (head == null) {
                System.out.println("Empty!!");
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            System.out.println(currNode.data);
            return;
        }

        public void viewstack() {
            if (head == null) {
                System.out.println("Null");
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.print(currNode.data);
            return;
        }

        public void pop() {
            if (head == null) {
                System.out.println("Underflow");
                return;
            }
            if (head.next==null) {
                head=null;
                return;
            }
            Node currNode = head;
            Node prevNode = head;
            while (currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = null;
            return;
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
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
            System.out.println("\nEnter a choice (1:push,2:pop,3:peek,4:view,5:Exit)");
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
                    myStack.peek();
                    break;
                case 4:
                    myStack.viewstack();
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
