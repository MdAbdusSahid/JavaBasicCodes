import java.util.*;

class Veg {

}

class Tomato extends Veg {
    void prepareTomatoCurry() {
        System.out.println("Curry Prepared");
    }
}

class Carrot extends Veg {
    void prepareHalwa() {
        System.out.println("Halwa Prepared");
    }
}

class Potato extends Veg {
    void PrepareFries() {
        System.out.println("Fries Prepared");
    }
}

class Onion extends Veg {
    void preparePakoda() {
        System.out.println("Pakoda prepared");
    }
}

class VegShop {
    Veg sell() {
        Scanner scn = new Scanner(System.in);
        System.out.println("1 for Tomato");
        System.out.println("2 for Carrot");
        System.out.println("3 for Potato");
        System.out.println("4 for Onion");
        int n = scn.nextInt();
        switch (n) {
            case 1:
                return new Tomato();
            case 2:
                return new Carrot();
            case 3:
                return new Potato();
            case 4:
                return new Onion();
            default:
                System.out.println("Invalid Inpt");
                return null;
        }
    }
}

public class MainVegShop {
    public static void main(String[] args) {
        VegShop shop = new VegShop();
        Veg v = shop.sell();
        if (v instanceof Tomato) {
            ((Tomato) v).prepareTomatoCurry();
        }
        if (v instanceof Carrot) {
            ((Carrot) v).prepareHalwa();
        }
        if (v instanceof Potato) {
            ((Potato) v).PrepareFries();
        }
        if (v instanceof Onion) {
            ((Onion) v).preparePakoda();
        }
    }
}
