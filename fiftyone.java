public class fiftyone {
    public static void rev_string(String str,String rev) {
        if (str.length()==0) {
            System.err.println(rev);
            return;
        }
        int curr=str.length()-1;
        rev+=str.charAt(curr);
        str=str.substring(0, curr);
        rev_string(str,rev);
    }
    public static void main(String[] args) {
        rev_string("sachin","");
    }
}
