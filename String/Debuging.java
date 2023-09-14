class Debuging {
    public static void main(String[] args) {
        String s1 = "12(14)13#(5)45(3)6";
        String s2 = "";
        char[] a = s1.toCharArray();
        int i = 0;
        while (i < a.length) {
            int n = 0;
            int r = 0;
            if (i + 2 < a.length && a[i + 2] == '#') {
                n = Integer.parseInt("" + a[i] + a[i + 1]);
                if (i + 3 < a.length && a[i + 3] == '(') {
                    int j = i + 4;
                    String s3 = "";
                    while (j < a.length && a[j] != ')') {
                        s3 += a[j];
                        j++;
                    }
                    i = ++j;
                    r = Integer.parseInt(s3);
                } else {
                    i = i + 3;
                }

            } else if (i + 2 < a.length && a[i + 2] != '#') {
                n = Integer.parseInt("" + a[i]);
                if (i + 1 < a.length && a[i + 1] == '(') {
                    int j = i + 2;
                    String s3 = "";
                    while (j < a.length && a[j] != ')') {
                        s3 += a[j];
                        j++;
                    }
                    i = ++j;
                    r = Integer.parseInt(s3);
                } else {
                    i++;
                }
            } else if (i >= a.length - 2) {
                n = Integer.parseInt(a[i] + "");
                i++;
            } else {
                i++;
            }
            s2 += getString(n, r);
        }
        System.out.println(s2);
    }

    static String getString(int n, int r) {
        if (r == 0) {
            r++;
        }
        char[] a = { '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        String s = "";
        for (int i = 1; i <= r; i++) {
            s += a[n];
        }
        return s;
    }
}