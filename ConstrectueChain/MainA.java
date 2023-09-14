package ConstrectueChain;

class A {
    A() {
        System.out.println("Class A");
    }
}

class B extends A {
    B() {
        System.out.println("Class B");
    }
}

class MainA {
    public static void main(String[] args) {
        B b = new B();
    }
}
