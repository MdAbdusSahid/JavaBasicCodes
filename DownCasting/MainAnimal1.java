class Animal1 {

}

class Dog1 extends Animal1 {

}

class Labrador extends Dog1 {

}

class Cat1 extends Animal1 {

}

public class MainAnimal1 {
    public static void main(String[] args) {
        Animal1 a1 = new Labrador();
        System.out.println(a1 instanceof Animal1);
        System.out.println(a1 instanceof Dog1);
        System.out.println(a1 instanceof Cat1);
    }
}
