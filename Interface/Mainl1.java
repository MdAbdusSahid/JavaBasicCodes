interface l1 {
    void m1();
}

class A implements l1 {
    public void m1() {
        System.out.println("m1 in A");
    }
}

class B implements l1 {
    public void m1() {
        System.out.println("M1 in B");
    }
}

public class Mainl1 {
    public static void main(String[] args) {
        l1 ref = new A();
        ref.m1();
        ref = new B();
        ref.m1();
    }
}
