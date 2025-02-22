import java.util.HashSet;
public class fiftysix {
    public static void subsequences(String str,int idx,String res , HashSet <String> unique) {
        if (idx==str.length()) {
            if (unique.contains(res)) {
                return;   
            }
            unique.add(res);
            System.err.println(res);
            return;
        }
        subsequences(str, idx+1, res+str.charAt(idx),unique);
        subsequences(str, idx+1, res,unique);
    }
    public static void main(String[] args) {
        HashSet <String> unique = new HashSet<>();
        subsequences("aaa",0,"" ,unique);
    }
}
