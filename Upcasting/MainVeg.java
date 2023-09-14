import java.util.*;

class Veg {

}

class Tomato extends Veg {

}

class Carrot extends Veg {

}

class Potato extends Veg {

}

class Onion extends Veg {

}

class VegShop {
    Veg sell() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Press 1 for Tomato");
        System.out.println("Press 2 for Carrot");
        System.out.println("Press 3 for Potato");
        System.out.println("Press 4 for Onion");
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
                System.out.println("Invalid input");
                return null;

        }
    }
}

class MainVeg {
    public static void main(String args[]) {
        VegShop shop = new VegShop();
        Veg v = shop.sell();
    }
}
