public class sixtyone {
    public static int callguests(int n) {
        if (n<=1) {
            return 1;
        }
        int single = callguests(n-1);
        int pair = (n-1)*callguests(n-2);

        return single+pair;
    }
    public static void main(String[] args) {
        int ways = callguests(4);
        System.err.println(ways);
    }
}
