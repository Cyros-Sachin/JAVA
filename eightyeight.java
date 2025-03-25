public class eightyeight {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binaryTree {
        int idx = -1;
        public Node makeTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=makeTree(nodes);
            newNode.right = makeTree(nodes);

            return newNode;
        }
    }
    public static Boolean isidentical(Node root1 , Node root2) {
        if (root1 == null && root2 == null ) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data == root2.data) {
            return isidentical(root1.left, root2.left) && isidentical(root1.right, root2.right);
        } 
        return false;
    }
    public static Boolean subtree(Node root1 , Node root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.data == root2.data) {
            if (isidentical(root1, root2)) {
                return true;
            }
        }
        return subtree(root1.left, root2) || subtree(root1.right, root2);
    }
    public static void main(String[] args) {
        int node1[] = {9,7,8,-1,-1,1,2,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
        int node2[] = {1,2,-1,-1,3,-1,-1};
        binaryTree tree1 = new binaryTree();
        binaryTree tree2 = new binaryTree();
        Node root1 = tree1.makeTree(node1);
        Node root2 = tree2.makeTree(node2);
        System.out.println(subtree(root1,root2));
    }
}
