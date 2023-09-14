interface Vichicle {
    void start();
}

interface Car extends Vichicle {
    void reverse();
}

class City implements Car {
    public void start() {
        System.out.println("Car start");
    }

    public void reverse() {
        System.out.println("Reverse Parking");
    }
}

class MainVichicle {
    public static void main(String[] args) {
        Car v1 = new City();
        v1.start();
        v1.reverse();
    }
}
