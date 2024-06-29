package example;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (/*
				 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
				 * class should be named Solution.
				 */
				Scanner sc = new Scanner(System.in)) {
			String A = sc.next();
			String B = sc.next();

			int A1 = A.length();
			int B1 = B.length();

			int C = A1 + B1;
			System.out.println(C);
			String A2 = A.substring(0, 1).toUpperCase() + A.substring(1);
			String B2 = B.substring(0, 1).toUpperCase() + B.substring(1);
			if (A2.compareTo(B2) > 0) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}
			System.out.println(A2 + " " + B2);
		}
	}
}