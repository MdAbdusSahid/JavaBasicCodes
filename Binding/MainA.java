class A {
    int i = 10;
}

class B extends A {
    int i = 20;
}

class C extends A {
    int i = 30;
}

class MainA {
    public static void main(String args[]) {
        A a1 = new B();
        System.out.println(a1.i);
        A a2 = new C();
        System.out.println(a2.i);
    }
}
