abstract class A {
    abstract void m1();

    void m2() {
        System.out.println("m2 in A");
    }
}

class B extends A {
    void m1() {
        System.out.println("m1 in B");
    }
}

class MainA {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        a.m2();
    }
}