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
    void drive(Car c) {
        c.start();
        c.accleration();
        c.breaks();
    }
}

class MainCar {
    public static void main(String args[]) {
        Car c1 = new Car();
        Car c2 = new Car();
        Driver d1 = new Driver();
        d1.drive(c1);
        System.out.println("----------------------------");
        d1.drive(c2);
    }
}