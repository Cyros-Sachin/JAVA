public class fortysix {
    public static void subsequences(String str,int idx,String res) {
        if (idx==str.length()) {
            System.err.println(res);
            return;
        }
        subsequences(str, idx+1, res+str.charAt(idx));
        subsequences(str, idx+1, res);
    }
    public static void main(String[] args) {
        subsequences("abc",0,"");
    }
}
