class B {
    static {
        System.out.println("Ststic block");
    }

    static void m1() {
        System.out.println("m1 static method");
    }
}

class MainB {
    public static void main(String[] args) {
        new B();
        // System.out.println("Main Start");
        // B.m1();
        // B.m1();
        // B.m1();
        // System.out.println("Main Ends");
    }
}
