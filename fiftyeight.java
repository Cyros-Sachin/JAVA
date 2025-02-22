public class fiftyeight {

    public static void permu(String str ,String perm) {
        if (str.length()==0) {
            System.err.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newsString = str.substring(0, i) + str.substring(i+1);
            permu(newsString, perm+curr);
        }
    }
    public static void main(String[] args) {
        permu("abc","");
    }
}
