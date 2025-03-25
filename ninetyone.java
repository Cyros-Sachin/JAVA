public class ninetyone {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
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

    public static Node deleteNode(Node root, int data){
        if (root.data > data) {
            root.left = deleteNode(root.left, data);
        }
        else if (root.data < data) {
            root.right = deleteNode(root.right, data);   
        }
        else{
            if (root.right == null && root.left==null) {
                return null;
            }


            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }

            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        if (root.left==null) {
            return root;
        }
        return inorderSuccessor(root.left);
    }
    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root,nodes[i]);
        }

        deleteNode(root,5);
        inorder(root);
    }
}
