import java.util.Scanner;

public class eighty {
    static class Node {
        int data;
        Node next;

        Node(int info) {
            this.data = info;
            this.next = null;
        }
    }

    static class Queue {
        static Node head=null;
        static Node tail = null;

        public boolean isEmpty(){
            return head==null && tail == null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head=newNode;
                tail=newNode;
                return;
            }
            Node currNode=head;
            while (currNode.next!=null) {
                currNode=currNode.next;
            }
            currNode.next=newNode;
            tail=newNode;
            return;
        }

        public void remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue!!");
                return;
            }
            if (head.next==null) {
                head=tail=null;
                return;
            }
            head=head.next;
            return;
        }

        public void peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue!!");
                return;
            }
            System.out.println(head.data);
            return;
        }
    }
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a choice : 1:add,2:Dequeue,3:peek,4:exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int data = sc.nextInt();
                    myQueue.add(data);
                    break;
                case 2:
                    myQueue.remove();
                    break;
                case 3:
                    myQueue.peek();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
    }
}
