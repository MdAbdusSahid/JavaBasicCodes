abstract class C {
    abstract void m1();

    void m2() {
        System.out.println("m2 in C");
    }
}

class D extends C {
    void m1() {
        System.out.println("m1 in D");
    }
}

class E extends C {
    void m1() {
        System.out.println("m1 in E");
    }
}

class MainC {
    public static void main(String[] args) {
        C c1 = new D();
        c1.m1();
        c1.m2();

        C c2 = new E();
        c2.m1();
        c2.m2();
    }
}
