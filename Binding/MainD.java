class D {
    void m1() {
        System.out.println("m1 in D");
    }
}

class E extends D {
    void m1() {
        System.out.println("m1 in E");
    }
}

class F extends D {
    void m1() {
        System.out.println("m1 in F");
    }
}

class MainD {
    public static void main(String args[]) {
        D d1 = new E();
        d1.m1();
        D d2 = new F();
        d2.m1();
    }
}
