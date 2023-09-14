class Circle {
    private int radious;

    public void getRadious(int r) {
        radious = r;
    }

    public int getRadious() {
        return radious;
    }

    public double getArea() {
        return 3.14 * radious * radious;
    }
}

class MainCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getRadious(10);
        int r = c1.getRadious();
        double a = c1.getArea();
    }
}
