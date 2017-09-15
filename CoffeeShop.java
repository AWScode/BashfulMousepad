//Vicky Cai 2017.09.15
import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] arg){
    Scanner in= new Scanner(System.in);
    System.out.println("Welcome to Awful Coffee, may I take your order?");
    String a = in.nextLine();

    Scanner in1= new Scanner(System.in);
    System.out.println("Do you want extra cream or no cream it?");
    String b = in1.nextLine();

    Scanner in2= new Scanner(System.in);
    System.out.println("And can I have your name?");
     String c = in2.nextLine();

    System.out.println("Thank you. One moment please.");

    System.out.println(c+", your "+ a +" with "+ b + " is ready.");
  }
}
