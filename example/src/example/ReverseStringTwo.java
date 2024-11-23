// Write a program to reverse a string using string builder class
package example;

import java.io.*;
import java.util.Scanner;

public class ReverseStringTwo {

    public static void main (String[] args)
    {
Scanner sc = new Scanner (System.in);
String str = sc.nextLine();

StringBuilder nstr= new StringBuilder();

   nstr.append(str);
   nstr.reverse();

System.out.println(nstr);
        
    }
}
