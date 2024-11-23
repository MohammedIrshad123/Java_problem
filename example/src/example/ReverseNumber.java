
//Reverse a number
package example;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner (System.in)) {
			int n = in.nextInt();
			
			int rev = 0 ;
			int rem;
			
			while (n>0) {
				    rem = n % 10; 
			        rev = (rev * 10) + rem; 
			        n = n / 10;
			        
			}
			
			
			System.out.println(rev);
		}
	}

}
