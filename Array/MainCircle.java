class Circle {
    int radious;

    Circle(int r) {
        radious = r;
    }

    public String toString() {
        return "Circle[radious=" + radious + "]";
    }

    double getArea() {
        return 3.14 * radious * radious;
    }
}

class MainCircle {
    public static void main(String[] args) {
        Circle[] a = new Circle[4];
        a[0] = new Circle(10);
        a[1] = new Circle(20);
        a[2] = new Circle(30);
        a[3] = new Circle(40);
        for (Circle c : a)
            System.out.println(c);
        System.out.println("area=" + a[0].getArea());
        for (Circle c : a)
            System.out.println(c.getArea());
    }
}
