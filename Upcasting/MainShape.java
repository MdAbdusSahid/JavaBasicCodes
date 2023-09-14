class Shape {

}

class Triangle extends Shape {

}

class Rectangle extends Shape {

}

class Circle extends Shape {

}

class MainShape {
    public static void main(String args[]) {
        m1(new Rectangle());
        m1(new Triangle());
        m1(new Circle());
    }

    static void m1(Shape s) {
        System.out.println("Executing m1(Shape)");
    }
}
