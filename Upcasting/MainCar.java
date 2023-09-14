class Car {

}

class Audi extends Car {

}

class Benz extends Car {

}

class BMW extends Car {

}

class Driver {
    void drive(Car c) {
        System.out.println("Car Executing");
    }
}

class MainCar {
    public static void main(String args[]) {
        Driver d = new Driver();
        d.drive(new Audi());
        d.drive(new Benz());
        d.drive(new BMW());
    }
}
