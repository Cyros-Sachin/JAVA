public class sixty {
    public static int countways(int n, int m) {
        if (n==m) {
            return 2;  
        }
        if (n<m) {
            return 1;
        }
        int vcount=countways(n-m, m);
        int hcount=countways(n-1, m);
        
        return vcount + hcount;
    }
    public static void main(String[] args) {
        int ways = countways(4,2);
        System.err.println(ways);
    }
}
