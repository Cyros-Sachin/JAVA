public class twentythird{
    public static void main(String args[]){
        int n=5;
        int coef=1;
        for(int i = 0; i< n; i++){
            for(int j=0;j< n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                if(k==0 || k==i){
                    coef=1;
                }else{
                    coef=coef*(i-k+1)/k;
                }
                System.out.print(coef+" ");
            }
            System.out.print("\n");
            
        }
    }
}