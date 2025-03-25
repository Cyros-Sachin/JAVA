public class eightyseven {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }

    static class Info {
        int height;
        int diameter;

        Info(int h, int d) {
            this.diameter = d;
            this.height = h;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return left >= right ? left + 1 : right + 1;
    }

    public static Info diameterTree(Node root) {
        if (root == null) {
            Info newinfo=new Info(0, 0);
            return newinfo;
        }
        Info left = diameterTree(root.left);
        Info right = diameterTree(root.right);
        Info newInfo = new Info(left.height>=right.height?left.height+1:right.height+1, Math.max(left.height+1+right.height, Math.max(left.diameter, right.diameter)));
        return newInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree tree = new binaryTree();
        Node root = tree.buildtree(nodes);
        Info elemeInfo = diameterTree(root);
        System.out.println(elemeInfo.diameter);
    }
}
