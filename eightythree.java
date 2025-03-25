import java.util.*;;
public class eightythree {
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

    static class binaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
    public static void levelorder(Node root) {
        if (root==null) {
            return;
        }
        Queue<Node> pq = new LinkedList<>();
        pq.add(root);
        pq.add(null);
        while (!pq.isEmpty()) {
            Node currNode = pq.remove();
            if (currNode==null) {
                if (pq.isEmpty()) {
                    break;
                }else{
                    System.out.println();
                    pq.add(null);
                }
            }else{
                System.out.print(currNode.data);
                if (currNode.left!=null) {
                    pq.add(currNode.left);
                }if (currNode.right!=null) {
                    pq.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
    }
}
