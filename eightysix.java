public class eightysix {
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
    public static int height(Node root) {
        if (root==null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return left>=right?left+1:right+1;
    }
    public static int diameterTree(Node root) {
        if (root==null) {
            return 0;
        }
        int left = diameterTree(root.left);
        int right = diameterTree(root.right);
        int diameter = height(root.left)+height(root.right)+1;
        return  Math.max(diameter, Math.max(left, right));
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildtree(nodes);
        int diameter = diameterTree(root);
        System.out.println(diameter);
    }
}
