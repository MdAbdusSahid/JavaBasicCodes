class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        System.out.println(a1 instanceof Dog);
        System.out.println(a1 instanceof Cat);
    }
}
