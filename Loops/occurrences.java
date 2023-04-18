import java.util.Scanner;
public class occurrences{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
          System.out.println("Enter numbers/digits: ");
          int n=input.nextInt();
          System.out.println("Enter the digit you want to count the occurrences: ");
          int occ=input.nextInt();    
          int count=0;
          int rem=0;     
          while(n>0)
          {
              rem=n%10;
              n=n/10;
              if(rem==occ)
              {
                  count++;
              }
          }
          System.out.print(count);
    }
}
