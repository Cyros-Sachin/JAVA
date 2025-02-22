public class fiftyfour {
    public static void movex(String str, String moved,int count,int idx) {
        if (idx==str.length()) {
            for (int i = 1; i <= count; i++) {
                moved+='x';
            }
            System.err.println(moved);
            return;
        }
        char check = str.charAt(idx);
        if (check != 'x') {
            moved+=check;
        }else{
            count++;
        }
        movex(str, moved, count, idx+1);
    }
    public static void main(String[] args) {
        movex("hbsuawxxisauxbsawxdjw","",0,0);
    }
}
