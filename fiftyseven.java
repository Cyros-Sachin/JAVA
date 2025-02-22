
public class fiftyseven {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz" };

    public static void subsequences(String str, int idx, String res) {
        if (idx==str.length()) {
            System.err.println(res);
            return;
        }
        char currchar = str.charAt(idx);
        String keys = keypad[currchar-'0'];
        for (int i = 0; i < keys.length(); i++) {
            subsequences(str, idx+1, res+keys.charAt(i));
        }
    }

    public static void main(String[] args) {
        subsequences("23", 0, "");
    }
}
