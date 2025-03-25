
import java.util.*;

public class eightyone {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
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
                    System.out.println(myQueue.peek()); 
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
