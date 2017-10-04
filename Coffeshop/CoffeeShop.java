//Vicky Cai 2017.09.15
import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] arg){
    Scanner in= new Scanner(System.in);
    System.out.println("Welcome to Awful Coffee. \nWe have awuful Cappuchino, green tea Frappuchino, Bitter Lemonade, surprise drink.\n Are you ready now?");
    String a = in.nextLine();

    if (a.equals("Yes")||a.equals("yes"))
       System.out.println("May I have your order?");
    else
       System.out.println("Okay, take your time. I will comeback. \nFive minutes later... \nMay I have your order now?");
    Scanner in3= new Scanner(System.in);
    String d = in3.nextLine();

    Scanner in1= new Scanner(System.in);
    System.out.println("Do you want extra cream or no cream on it?");
    String b = in1.nextLine();

    Scanner in2= new Scanner(System.in);
    System.out.println("And can I have your name?");
     String c = in2.nextLine();

    System.out.println("Thank you. One moment please.");

    System.out.println(c+", this is your "+ d +" with "+ b + " is ready.");
  }
}
