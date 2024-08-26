// package OOPS;

/**
 * OOPS
 */
public class OOPS {
public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.Color);
    // System.out.println(p1.getColor()); //if private
    p1.SetPrice(10);
    System.out.println(p1.Price);
    // System.out.println(p1.getPrice());
    // p1.setColor("Red");
    // System.out.println(p1.getColor());
}
    
}

class Pen{
    String Color;
    int Price;
//  if we make the properties private then we have to use setter and getters eg:

//  Private String Color;
//  Private int price;

    // String getColor(){
    //     return this.Color;
    // }
    // int getPrice(){
    //     return this.Price;
    // } 
    void setColor(String newColor){
        Color = newColor;
    }
    void SetPrice(int newPrice){
        Price = newPrice;
    }
}