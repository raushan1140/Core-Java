public class inheritance {
    public static void main(String[] args) {
        Fish shark  = new Fish();
        shark.eat();
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



//Derived class /subclass

class Fish extends Animal{
    int fins;

    void swin(){
        System.out.println("swims in water");
    }
}