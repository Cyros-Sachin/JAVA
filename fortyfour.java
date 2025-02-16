import java.util.*;
public class fortyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter your email:");
        String email = sc.next();
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                break;
            }
            username+=email.charAt(i);
        }
        System.err.println(username);
    }
}
