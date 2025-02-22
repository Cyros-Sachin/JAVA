public class fifty {
    public static void hanoi(int n , String source , String helper , String dest) {
        if (n==0) {
            return;
        }
        if (n==1) {
            System.err.println("Move disk "+n+" from " + source +" to "+dest);
            return;
        }
        hanoi(n-1,source,dest,helper);
        System.err.println("Move disk "+n+" from " + source +" to "+dest);
        hanoi(n-1,helper,source,dest);
    }
    public static void main(String[] args) {
        hanoi(3,"A","B","C");
    }
}
