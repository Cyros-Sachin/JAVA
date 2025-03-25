public class eightytwo {
    static class Node {

        int data;
        Node leftchild;
        Node rightchild;

        Node(int data) {
            this.data = data;
            this.leftchild = null;
            this.rightchild = null;
        }
    }

    static class binaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.leftchild = buildTree(nodes);
            newNode.rightchild = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
