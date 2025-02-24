import java.util.Stack;

public class seventyseven {

    public static void add_item_atbottom(int data,Stack<Integer> myStack){
        if (myStack.empty()) {
            myStack.push(data);
            return;
        }
        int top = myStack.pop();
        add_item_atbottom(data, myStack);
        myStack.push(top);
        return;
    }
    public static void reverse(Stack<Integer> myStack){
        if (myStack.empty()) {
            return;
        }
        int top = myStack.pop();
        reverse(myStack);
        add_item_atbottom(top, myStack);
        return;
    }
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack);
        reverse(myStack);
        System.out.println(myStack);
    }
}