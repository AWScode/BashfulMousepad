import java.util.*;
public class Binary {
      public static void main(String[] arg){
      Scanner in1= new Scanner(System.in);
      System.out.println("Please give the first binary number."); //ask for typing the first binary number for later calculation//
      String a = in1.nextLine(); //input of the string version of the first binary number//

      Scanner in2=new Scanner(System.in);
      System.out.println("Please give the second binary number."); //ask for typing the second binary number for later calculation//
      String b = in2.nextLine(); //input of the string version of the second binary number//

      int numbera []=new int[8]; //the array for storing the input a in 8 digits
      for (int i=0; i<8; i++) {
        if(i<a.length()){
          int aa =a.length()-1;
          int numbera1 = Integer.parseInt(a.substring(aa-i,a.length()-i));
          System.out.println(numbera1);
          numbera[i]=numbera1;
        }
        else{
          numbera[i]=0;
        }
      }
  System.out.println(Binary.toint(numbera));
  }
}
