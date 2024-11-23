package example;

//78import java.util.*;

public class ReverseString {

    public void main(String[] arg) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "moom";
        String nstr = " ";
        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }
}
