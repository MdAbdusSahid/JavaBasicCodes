import java.util.Stack;

class BalanceStringStack {
    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]"));
    }

    static boolean isBalanced(String s1) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty() || !pair(stack.pop(), c))
                    return false;
            }
        }
        if (stack.isEmpty())
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
