import java.util.*;
public class ninetythree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }
    public static void printpath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printNode2leaf(ArrayList<Integer> path ,Node root) {
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right == null) {
            printpath(path);
        }
        printNode2leaf(path, root.left);
        printNode2leaf(path, root.right);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root,nodes[i]);
        }
        ArrayList<Integer> paths = new ArrayList<>() ;
        printNode2leaf(paths, root);
    }
}
