import java.util.*;

class fortythree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a string:");
        String original = sc.next();
        String result="";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i)=='e') {
                result+='i';
            }else{
                result+=original.charAt(i);
            }
        }
        System.err.println(result);
    }
}