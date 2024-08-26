// package Abstraction;

public class abstraction {
    public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);    //Animal constructor will called  here

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        //Animal-> Horse -> Mustang
    }
}

abstract class Animal{
    // creating a constructor
    String color;
    Animal(){
        color = "brown";
        System.out.println("animal constructor called");
    }
    ///
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

//subclass
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}