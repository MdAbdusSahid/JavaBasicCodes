import java.util.function.IntSupplier;

class AllTypeCheck {

    static boolean isDigitExist(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > '0' && c <= '9')
                return true;
        }
        return false;
    }

    static boolean isUpperExist(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'A' && c <= 'Z')
                return true;
        }
        return false;
    }

    static boolean isLowerExist(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'a' && c <= 'z')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abasgf879AOIBOUDB";
        boolean len = s.length() >= 4 && s.length() <= 20;
        boolean dig = isDigitExist(s);
        boolean upper = isUpperExist(s);
        boolean lower = isLowerExist(s);
        if (len && dig && upper && lower)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}