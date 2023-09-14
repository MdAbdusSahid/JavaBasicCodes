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
        c.start();
        c.accleration();
        c.breaks();
    }
}

class MainCar1 {
    public static void main(String args[]) {
        Driver d1 = new Driver(new Car());
        d1.drive();
        System.out.println("---------------------------");
        Driver d2 = new Driver(new Car());
        d2.drive();
    }
}