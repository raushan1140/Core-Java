// package Keywords;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();

    }
}

class Animal{
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();    //it will call Animal class(Parent class), if we don't write super(), java bydefault create it  
        System.out.println("Horse constructor is called");
    }
}