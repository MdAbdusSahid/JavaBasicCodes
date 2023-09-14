class Animal {
    void makeSound() {
        System.out.println("makeSound in Animal");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("bow bow");
    }

    void play() {
        System.out.println("dog playing");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("meow meow");
    }

    void killRat() {
        System.out.println("rat is killed by Cat");
    }
}

class MainAnimal {
    public static void main(String[] args) {
        Animal[] a = new Animal[4];
        a[0] = new Dog();
        a[1] = new Cat();
        a[2] = new Cat();
        a[3] = new Dog();
        for (Animal ani : a)
            ((Dog) ani).play();

    }
}
