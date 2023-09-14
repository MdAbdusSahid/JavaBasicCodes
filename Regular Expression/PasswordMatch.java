import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the password:");
        String str = scn.nextLine();
        Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^*+-]).{6,10}");
        Matcher m = p.matcher(str);
        boolean res = m.matches();
        if (res)
            System.out.println("Valid");
        else
            System.out.println("InValid");
    }
}
