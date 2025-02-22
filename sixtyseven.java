import java.util.Scanner;

public class sixtyseven {
    Node head;
    class Node {
        int info;
        Node next;

        Node(int info){
            this.info=info;
            this.next=null;
        }
    }
    public void additem(int info){
        Node newNode = new Node(info);
        if (head == null) {
            head = newNode;
            return;
        }if (head.next==null) {
            head.next=newNode;
            return;
        }
        Node lastNode = head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
        return;
    }

    public void printlist(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.info+"->");
            curr=curr.next; 
        }
        System.out.print("NULL");
    }

    public void search(int info){
        Node curr = head;
        int idx=0;
        while (curr!= null) {
            if (curr.info==info) {
                System.out.println("Found at idx :"+idx);
                return;
            }
            idx++;
            curr=curr.next;
        }
        System.out.println("Not found!!");
        return;
    }
    public static void main(String[] args) {
        sixtyseven list = new sixtyseven();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Size of linked list: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter data"+i+": ");
            int info = sc.nextInt();
            list.additem(info);
        }
        list.printlist();

        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        list.search(num);
    }
}
