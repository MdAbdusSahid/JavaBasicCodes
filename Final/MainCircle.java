class Circle {
    int radious = 10;
}

class MainCircle {
    public static void main(String[] args) {
        final Circle c1 = new Circle();
        System.out.println(c1.radious);
        c1.radious = 20;
        System.out.println(c1.radious);
        // c1 = null;
    }
}
