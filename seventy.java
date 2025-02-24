import java.util.Scanner;

public class seventy {
    Node head;

    class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    public void additem(int info) {
        Node newNode = new Node(info);
        if (head == null) {
            head = newNode;
            return;
        }
        if (head.next == null) {
            head.next = newNode;
            return;
        }
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return;
    }

    public void printlist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.info + "->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

    public void search(int info) {
        Node curr = head;
        int idx = 0;
        while (curr != null) {
            if (curr.info == info) {
                System.out.println("Found at idx :" + idx);
                return;
            }
            idx++;
            curr = curr.next;
        }
        System.out.println("Not found!!");
        return;
    }

    public void removenode(Node node) {
        if (node == head) {
            head = node.next;
            return;
        }
        Node currNode = head;
        Node prevNode = head;
        while (currNode != node) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = currNode.next;
    }

    public void remove_above25() {
        Node curNode = head;
        while (curNode != null) {
            if (curNode.info > 25) {
                Node next = curNode.next;
                removenode(curNode);
                curNode = next;
                continue;
            }
            curNode = curNode.next;
        }
    }

    public void reverse() {
        if (head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public Node reverse_recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse_recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public void removefromlast(int n){
        Node currNode = head;
        int count=1;
        while (count!=n) {
            currNode=currNode.next;
            count++;
        }
        removenode(currNode);
    }

    public static void main(String[] args) {
        seventy list = new seventy();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Size of linked list: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter data" + i + ": ");
            int info = sc.nextInt();
            list.additem(info);
        }
        list.printlist();

        System.out.println("\n Enter the value of n to be deleted from last :");
        int n = sc.nextInt();
        list.removefromlast(size-n+1);
        list.printlist();
    }
}
