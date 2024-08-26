public class hierarchial_inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        
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
// derived class
class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
// derived class
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
// derived class
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}