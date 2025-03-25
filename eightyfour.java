public class eightyfour {
    static class Node{
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
        static int idx=-1;
        public Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }
    }

    public static int Countroots(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Countroots(root.left);
        int right = Countroots(root.right);
        return left+right+1;
    }
    public static int sumNode(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumNode(root.left);
        int right = sumNode(root.right);
        return left+right+root.data;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildtree(nodes);
        int count = Countroots(root);
        int sum = sumNode(root);
        System.out.println(count);
        System.out.println(sum);
    }
}
