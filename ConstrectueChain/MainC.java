//package ConstrectueChain;

class C {
    C(int i) {
        System.out.println("C(int)");
    }
}

class D extends C {
    D() {
        super(10);
        System.out.println("D()");
    }
}

class MainC {
    public static void main(String[] args) {
        D d = new D();
    }
}
