public class ninety {
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

    public static Boolean search(Node root,int data) {
        if (root==null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data > data) {
            return search(root.left, data);
        }
        else{
            return search(root.right, data);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root,nodes[i]);
        }

        System.out.println(search(root,4));
    }
}
