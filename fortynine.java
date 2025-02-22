public class fortynine {
    public static void num_rev(int num) {
        if (num==0) {
            return;
        }
        System.err.print(num);
        num_rev(num-1);
    }
    public static void num_for(int num) {
        if (num==6) {
            return;
        }
        System.err.print(num);
        num_for(num+1);
    }
    public static void sum(int num,int sum) {
        if (num==0) {
            System.err.println(sum);
            return;
        }
        sum+=num;
        // System.err.print(num);
        sum(num-1,sum);
    }
    public static void fact(int num,int fact) {
        if (num==0) {
            System.err.println(fact);
            return;
        }
        fact*=num;
        fact(num-1,fact);
    }
    public static void fib(int num,int a,int b) {
        if (num==0) {
            return;
        }
        System.err.println(a+b);
        fib(num-1,b,a+b);
    }
    public static void pow(int num,int n,int res) {
        if (n==0) {
            System.err.println(res);
            return;
        }
        res*=num;
        pow(num,n-1,res);
    }
    public static void main(String[] args) {
        // num_rev(5);
        // num_for(1);
        // sum(10,0);
        // fact(5,1);
        // fib(10,-1,1);
        pow(5,2,1);
    }
}