import java.util.*;
public class patternMagic {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in) ;

		int n = sc.nextInt() ;
		int spaces = -1 ;

		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=n-i+1 ; j++){
				System.out.print("*") ;
			} ;

			// for spaces 
			for(int k=1 ; k<=spaces ; k++){
				System.out.print(" ") ;
			} ;

			for(int j=1 ; j<=n-i+1 ; j++){
				if(i==1 && j==1){
					continue ;
				}
				System.out.print("*") ;
			} ;

			spaces+=2 ;
			System.out.println() ;
		} ;

		spaces-=4 ;

		for(int i=1 ; i<=n-1 ; i++){
			for(int j=1 ; j<=i+1 ; j++){
				System.out.print("*") ;
			} ;

			// for spaces
			for(int k=1 ; k<=spaces ; k++){
				System.out.print(" ") ;
			} ;

			for(int j=1 ; j<=i+1 ; j++){
				if(i==n-1 && j==1){
					continue ;
				}
				System.out.print("*") ;
			}

			spaces-=2 ;
			System.out.println() ;
		}

    }
}
