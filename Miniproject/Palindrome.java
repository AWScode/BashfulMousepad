
//Vicky Cai 2017.10.20
import java.util.*;
public class Palindrome {
    public static boolean palindromeCheck(String test) {
        int a = (test.length()/2);
        int b = test.length();
        String c=test.substring(0,a);
        String d= null;
        if (test.length()%2==0){
          d = test.substring(a,b);
        }
        else{
          d = test.substring(a+1,b);}

        if (c.equals(new StringBuilder(d).reverse().toString())){
        return true;}
        else{
        return false;}
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);
        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }
    }
}
