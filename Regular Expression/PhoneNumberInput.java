import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneNumberInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Phone Number:");
        String phone = scn.nextLine();
        if (validatePhoneNumber(phone))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    static boolean validatePhoneNumber(String str) {
        Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
