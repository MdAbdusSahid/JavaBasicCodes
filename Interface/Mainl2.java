interface l2 {
    void m1();
}

interface l3 {
    void m2();
}

class C implements l2, l3 {
    public void m1() {
        System.out.println("m1 in C");
    }

    public void m2() {
        System.out.println("m2 in C");
    }
}

public class Mainl2 {
    public static void main(String[] args) {
        l2 ref1 = new C();
        ref1.m1();
        l3 ref2 = new C();
        ref2.m2();
    }
}
