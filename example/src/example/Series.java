/*We use the integers a,b, and n  to create the following series: 
 (a+2^0*b),(a+2^0*b+2^1.b),..,(a+2^0*b+2^1.b+...+2^n-1.b)
You are given  queries in the form of a, b and n. For each query, 
print the series corresponding to the given a, b, and n  values as a single line of  space-separated integers.
*/

package example;
import java.util.*;
public class Series {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		        
		        for (int i = 0; i < t; i++) {
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            
		            int z = a;
		            for (int j = 0; j < n; j++) {
		                z += (int)Math.pow(2, j) * b;
		                System.out.print(z + " ");
		            }
		            		        }
		        
		        in.close();
		    }
	

}
