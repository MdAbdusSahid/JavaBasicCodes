class A {
    int i = 1;

    void m1() {
        System.out.println("m1 in A");
    }
}

class B extends A {
    int j = 2;

    void m2() {
        System.out.println("m2 in B");
    }
}

class C extends A {
    int k = 3;

    void m3() {
        System.out.println("m3 i C");
    }
}

public class MainA {
    public static void main(String args[]) {
        A a1 = new B();// upcasting
        System.out.println(a1.i);
        // System.out.println(a1.j);// error
        a1.m1();
        // a1.m2();// error
        A a2 = new C();
        System.out.println(a1.i);
        // System.out.println(a1.k);// error
        a1.m1();
        // a1.m3();//error
    }
}
