public class nineteenth {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        int digit =1;
        int rev=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print(digit);
                if(digit==i && k==1){
                    rev=1;
                }
                if(k==i){
                    digit=1;
                    rev=0;
                }
                if(rev==1){
                    digit--;
                }else{
                    digit++;
                }
            }
            System.out.print("\n");
            num+=2;
        }
    }
}