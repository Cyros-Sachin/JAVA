public class fiftytwo {
    public static int first = -1;
    public static int last = -1;
    public static void occurence(String str , char ele) {
        if (str.length()==0) {
            if (first == -1 && last == -1) {
                System.err.println("Not found!!");
                return;  
            }else if (first == -1 && last != -1) {
                System.err.println("first : "+last);
                System.err.println("last : "+last);

                return;
            }
            else{
                System.err.println("first : "+first);
                System.err.println("last : "+last);
                return;
            }
        }
        int curr=str.length()-1;
        if (ele == str.charAt(curr) && last == -1) {
            last=curr;
        }else if (ele == str.charAt(curr)) {
            first=curr;
        }
        str=str.substring(0, curr);
        occurence(str,ele);
    }
    public static void main(String[] args) {
        occurence("",'a');
    }
}
