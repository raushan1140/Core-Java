public class multiLevel_inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//multilevel Inheritance >> base classs=> derived class => derived class

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}
