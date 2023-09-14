class Car {
    int regNum;
    private static int count = 1000;
    {
        regNum = count++;
    }

    void start() {
        System.out.println(regNum + "Car started");
    }

    void accleration() {
        System.out.println(regNum + "Car Acclerated");
    }

    void breaks()

    {
        System.out.println(regNum + "Car Stop");
    }
}

class Driver {
    Car c;

    Driver(Car c) {
        this.c = c;
    }

    void drive() {
        if (c == null) {
            System.out.println("Provide a car to this Driver");
        }
        c.start();
        c.accleration();
        c.breaks();
    }

    void drive(Car c) {
        c.start();
        c.accleration();
        c.breaks();
    }
}

class MainCar2 {
    public static void main(String args[]) {
        Car myCar = new Car();
        Driver d1 = new Driver(new Car());
        d1.drive();
        System.out.println("--------------------");
        Driver d2 = new Driver(myCar);
        d2.drive(myCar);
    }
}