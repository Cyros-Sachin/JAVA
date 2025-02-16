import java.util.*;
class fortytwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array:");
        int size = sc.nextInt();
        int com_len=0;
        String array[] = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.next();
            com_len= com_len+array[i].length();
        }
        System.err.println("combined length is:"+com_len);
    }
}