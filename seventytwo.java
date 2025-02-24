import java.util.Scanner;

public class seventytwo {
    Node head;

    class Node {
        int info;
        Node next;

        Node(int info, boolean status) {
            if (status) {
                this.info = info;
                this.next = head;
            }else{
                this.info = info;
                this.next = null;
            }

        }
    }

    public void additem(int info, int i, boolean last) {
        Node newNode = new Node(info, last);
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
        do {
            System.out.print(curr.info + "->");
            curr = curr.next;
        } while (curr != head);
        System.out.print(curr.info);
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

    public void removefromlast(int n) {
        Node currNode = head;
        int count = 1;
        while (count != n) {
            currNode = currNode.next;
            count++;
        }
        removenode(currNode);
    }

    public Node findmiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Node reverse_part(Node parthead) {
        Node prev = null;
        Node curr = parthead;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public void checkpalindrome() {
        if (head == null || head.next == null) {
            System.out.println("\nPalindrome");
            return;
        }
        Node middleNode = findmiddle(head);
        Node lasthalf = reverse_part(middleNode.next);
        Node currNode = head;
        while (lasthalf != null) {
            if (currNode.info != lasthalf.info) {
                System.out.println("\nNot Palindrome");
                return;
            }
            lasthalf = lasthalf.next;
            currNode = currNode.next;
        }
        System.out.println("\nPalindrome");
        return;
    }

    public void checkloop(){
        Node turtle = head;
        Node hare = head;
        do {
            turtle=turtle.next;
            hare=hare.next.next;
            if (hare.next==null || hare.next.next==null) {
                System.out.println("No loop");
                return;
            }
        } while (turtle!=hare);
        
        System.out.println("\nLoop found in the linked list!!");
    }
    public static void main(String[] args) {
        seventytwo list = new seventytwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Size of linked list: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter data" + i + ": ");
            int info = sc.nextInt();
            if (i != size) {
                list.additem(info, i, false);
                continue;
            }
            list.additem(info, size, true);

        }
        list.printlist();

        list.checkloop();
    }
}
