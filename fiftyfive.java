public class fiftyfive {
    public static void removeduplicates(String str, String removed,int idx) {
        if (idx==str.length()) {
            System.err.println(removed);
            return;
        }
        char ele = str.charAt(idx);
        boolean check = true;
        for (int i = 0; i < removed.length(); i++) {
            if (removed.charAt(i)==ele) {
                check=false;
            }
        }
        if (check) {
            removed+=ele;
        }
        removeduplicates(str, removed, idx+1);
    }
    public static void main(String[] args) {
        String str = "abcadbcefghabi";
        removeduplicates(str,"",0);
    }
}
