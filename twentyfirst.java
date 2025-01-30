public class twentyfirst{
    public static void main(String args[]){
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j==1 || j==10 || j==i || j==n-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    }
}