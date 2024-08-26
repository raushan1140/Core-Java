// package Abstraction.Interface;

/**
 * interFaces
 */
public class interFaces {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eat();
        b.hunt();
    }
}

//multiple inheritance

interface Herbivore {
    void eat();
}

interface Carnivore {
    void hunt();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Bear eats plants.");
    }

    public void hunt() {
        System.out.println("Bear hunts for meat.");
    }
}


/////////////
//interface


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right ,diagonal(in all 4 dir)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}