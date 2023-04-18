import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int p=0;         //previous number 
        int i=1;        //Current index
        int count=2;
        
        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count++;
        }
        System.out.print(i);
        
    }
}




