public class twentyfifth{
    public static void main(String args[]){
        int n=5;
        int coef=1;
        for(int i = n; i>0; i--){
            for(int j=0;j< n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i-2;k++){
                System.out.print(coef+" ");
            }
            System.out.print("\n");
            coef++;
        }
    }
}