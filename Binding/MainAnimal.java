class Animal {
    void makeSound() {
        System.out.println("makeSound() of Animal");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bow Bow");
    }
}

class Cage {
    Animal a;

    Cage(Animal a) {
        this.a = a;
    }

    void hit() {
        a.makeSound();
    }
}

class MainAnimal {
    public static void main(String args[]) {
        Cage c1 = new Cage(new Dog());
        c1.hit();
        Cage c2 = new Cage(new Cat());
        c2.hit();
    }
}
