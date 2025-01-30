public class twentyth{
    public static void main(String args[]){
        int n=4;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            num+=2;
        }
        num-=2;
        for(int i=n;i>0;i--){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            num-=2;
        }
    }
}