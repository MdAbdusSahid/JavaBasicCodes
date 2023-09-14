class AA {

}

class BB extends AA {
    void m2() {
        System.out.println("m2 in B");
    }
}

class MainA1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = (B) a1;
    }
}
