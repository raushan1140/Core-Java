import java.util.Scanner;
public class typecasting {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        // typecasting is used to change the daya types of value 
        int num = (int)(67.65f); //here we are changing the value 67.65 from float to integer.
        System.out.println(num); // in output it'll give only 67. This is called typecasting
    }
}
