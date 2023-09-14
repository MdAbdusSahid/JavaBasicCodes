import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scn.nextLine();
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(s);
        // int count = 0;
        // while (m.find()) {
        // count++;
        // }
        // System.out.println(count);
        while (m.find()) {
            System.out.println("Start=" + m.start());
            System.out.println("Ends=" + m.end());
            System.out.println("Group of=" + m.group());
        }
    }
}
