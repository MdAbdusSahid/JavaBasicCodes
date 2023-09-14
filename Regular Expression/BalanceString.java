class BalanceString {
    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]"));
    }

    static boolean isBalanced(String s1) {
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                s2 += c;
            } else if (c == ']' || c == '}' || c == ')') {
                if (s2.length() == 0)
                    return false;
                char c1 = s2.charAt(s2.length() - 1);// get last char
                s2 = s2.substring(0, s2.length() - 1);// remove last char in s2
                if (!pair(c1, c))// checking is the string empty
                    return false;
            }
        }
        if (s2.length() == 0)
            return true;
        else
            return false;
    }

    static boolean pair(char c1, char c2) {
        if (c1 == '[' && c2 == ']')
            return true;
        if (c1 == '{' && c2 == '}')
            return true;
        if (c1 == '(' && c2 == ')')
            return true;
        return false;

    }
}
