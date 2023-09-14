class AA {
    static void m1() {
        System.out.println("static m1 in AA");
    }
}

class BB extends AA {
    static void m1() {
        System.out.println("static m1 in BB");
    }
}

class CC extends AA {
    static void m1() {
        System.out.println("static m1 in CC");
    }
}

class MainAA {
    public static void main(String args[]) {
        AA a1 = new BB();
        a1.m1();
        AA a2 = new CC();
        a2.m1();

    }
}
