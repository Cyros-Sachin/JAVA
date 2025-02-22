public class fiftynine {
    public static int countpath(int i, int j,int n, int m) {
        if (i==n-1 && j==m-1) {
            return 1;
        }
        if (i==n || j==n) {
            return 0;
        }
        int downcount=countpath(i, j+1, n, m);
        int rightcount=countpath(i+1, j, n, m);
        
        return downcount + rightcount;
    }
    public static void main(String[] args) {
        int paths = countpath(0,0,3,3);
        System.err.println(paths);
    }
}
