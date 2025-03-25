import java.util.Scanner;

public class seventyeight {
    static class Queue {
        int arr[];
        int rear;
        int size;
        int front=-1;
        Queue(int n){
            this.size=n;
            arr = new int[size];
            this.rear=-1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return rear == size-1;
        }

        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is full!!");
                return;
            }
            arr[++rear]=data;
            if (front==-1) {
                // front=arr[0];
                front=0;
            }
            return;
        }

        public void deQueue(){
            if (isEmpty()) {
                System.out.println("Empty queue!!");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            // front=arr[0];
            if (isEmpty()) {
                front=-1;
            }
            rear--;
        }

        public void peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue!!");
                return;
            }
            System.out.println(arr[front]);
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Queue: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue myQueue = new Queue(size);
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            myQueue.add(data);
        }
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
                    myQueue.deQueue();
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
