// Write a palindrome program for string

import java.io.*;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

Scanner sc = new Scanner (System.in);
  String str = sc.nextLine();

  StringBuilder  nstr = new StringBuilder(str);
        nstr.reverse();
        System.out.println(nstr);

        if (str.equals(nstr.toString()) )
        {
            System.out.println("the given string is palindrome" +" " + nstr );
        }
        else {
            System.out.println("the given string is not palindrome"  + " " + nstr);
        }
    }
    
}
