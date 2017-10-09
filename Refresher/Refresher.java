//Vicky Cai & Julia Zhu 2017.10.06
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Refresher{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    System.out.println("You want some coffee to refresh your mind.(press enter)");
    String a = in.nextLine();

    Scanner in1= new Scanner(System.in);
    System.out.println("But you suddenly find out that you do not have hot water!!!(press enter)");
    String b = in.nextLine();

    Scanner in2= new Scanner(System.in);
    System.out.println("Therefore, you decide to stand up and go to the watercooler.(press enter)");
    String c = in.nextLine();

    Scanner in3= new Scanner(System.in);
    System.out.println("Unfortunately, you find there is a line of two collegues in front of you.(press enter)");
    String d = in.nextLine();

    Scanner in4= new Scanner(System.in);
    System.out.println("Silence...(press enter)");
    String e = in.nextLine();

    Scanner in5= new Scanner(System.in);
    System.out.println("It is the most awkward time you've ever experienced in your life.(press enter)");
    String f = in.nextLine();

    Scanner in6= new Scanner(System.in);
    System.out.println("However, this smart program will help you to start a wonderful and unprecedented conversation no one have ever experienced.(press enter)");
    String g = in.nextLine();

//Those are the context of the program

    String zy = "0";
//this while loop is for inside return(from choosing the difficulties)
    while (zy.equals("0")){
      Scanner in7= new Scanner(System.in);
      System.out.println("Now choose from integers 1-4. Each number represent its difficulty (1 is the highest). (press enter )");
      String h1 = in.nextLine();
      System.out.println("If you want to try the special option(**choose with courage), please enter 'x'.(press enter)");
      String h2 = in.nextLine();
      System.out.println("Enter '0' to exit this program.(press enter)");
      String h3 = in.nextLine();
      System.out.println("And start a legendary journey...(press 1-4 or x or 0)");
      String h = in.nextLine();

// read the files
      File file=new File("/Users/huiyi_cai/Desktop/computer science/BashfulMousepad/Refresher/topics.txt");
      BufferedReader reader=null;
      String temp=null;
      int line=1;

      ArrayList<String> topics =new ArrayList<>();
      try{
        reader=new BufferedReader(new FileReader(file));
        while((temp=reader.readLine())!=null){
            topics.add(temp);
        }
      }
//chack for the exception, and try method needs always combine with catch method
      catch(Exception z){
        z.printStackTrace();
      }
//finally method--need to learn more
      finally{
        if(reader!=null){
          try{
            reader.close();
          }
          catch(Exception z){
            z.printStackTrace();
          }
        }
      }

//make the list in order by how frequently it appears
      HashMap<String, Integer> countMap = new HashMap<String, Integer>();
      for (int i=0; i<topics.size(); i++) {
        String top = topics.get(i);
        if (!countMap.containsKey(top)) {
          countMap.put(top, 1);
        }
        else {
          Integer count = countMap.get(top);
          count = count + 1;
          countMap.put(top, count);
        }
      }
//restore all the topics in 4 arrays by the frequency
      ArrayList<String> hard =new ArrayList<>();
      ArrayList<String> middle=new ArrayList<>();
      ArrayList<String> normal =new ArrayList<>();
      ArrayList<String> low =new ArrayList<>();
      for(int i=0; i<topics.size();i++){
        String top=topics.get(i);
        if(countMap.get(topics.get(i))==4){
          if(!low.contains(top)){
            low.add(top);
          }
        }
        if(countMap.get(topics.get(i))==3){
          if(!normal.contains(top)){
            normal.add(top);
          }
        }
        if(countMap.get(topics.get(i))==2){
          if(!middle.contains(top)){
              middle.add(top);
          }
        }
        if(countMap.get(topics.get(i))==1){
            if(!hard.contains(top)){
              hard.add(top);
            }
          }
        }
//Random numbers
        Random rand= new Random();
        int high1=hard.size();
        int middle1=middle.size();
        int normal1=normal.size();
        int low1=low.size();
//while loop for return the statement to choose the difficulties again if player chooses wrong
      String zx= "0";
      while (zx.equals("0")){
        if (h.equals("1")) {
//while loop for return the statement in hard, if player chooses the wrong topic they want in hard list
          String zz= "0";
          while (zz.equals("0")){
            Scanner in8= new Scanner(System.in);
            String hl=hard.get(rand.nextInt(high1));
            System.out.println("Wooo, bravo!! You choose the hardest risk: "+ hl +"\nChoose one to start.\nIf you regret, please enter 0.\nIf not, PLEASE ENTER 1");
            String j = in.nextLine();
//this if statement is for returning to choose from hard list again
                if(j.equals("0")){
                  zz = "1" ;
                  zx= "1";
                }

                if(j.equals("1")){

                    Scanner in100= new Scanner(System.in);
                    System.out.println("The line becomes longer when you are hesitated.(press enter)");
                    String b1 = in.nextLine();
                    System.out.println("Can't wait, you need coffee right now.(press enter)");
                    String b2 = in.nextLine();
                    System.out.println("So you decide to talk with Jack, the last person in line.(press enter)");
                    String a1 = in.nextLine();

                    Scanner in99= new Scanner(System.in);
                    System.out.println("You: Hey Jack, how's going?(press enter)");
                    String a2 = in.nextLine();

                    Scanner in98= new Scanner(System.in);
                    System.out.println("Jack: Pretty awesome.(press enter)");
                    String a3 = in.nextLine();

                    Scanner in97= new Scanner(System.in);
                    System.out.println("You: Do you want to hear one fact of " +hl+" ?(press enter)");
                    String a4 = in.nextLine();

                    Scanner in96= new Scanner(System.in);
                    System.out.println("Jack: Maybe, not right now.(press enter)");
                    String a5 = in.nextLine();

                    Scanner in95= new Scanner(System.in);
                    System.out.println("You: Okay?(press enter)");
                    String b3 = in.nextLine();
                    System.out.println("     Really?(press enter)");
                    String b4 = in.nextLine();
                    System.out.println("     You do not want to hear that fun fact?(press enter)");
                    String a6 = in.nextLine();

                    Scanner in94= new Scanner(System.in);
                    System.out.println("Jack looks at his cup: hummm...(press enter)");
                    String b5 = in.nextLine();
                    System.out.println("                       I think I need to finish my work right now. (press enter)");
                    String b6 = in.nextLine();
                    System.out.println(                        hl+" , emm, I will come back and talk with you later.(press enter)");
                    String b7 = in.nextLine();
                    System.out.println("                       Bye(press enter)");
                    String a7 = in.nextLine();

                    Scanner in93= new Scanner(System.in);
                    System.out.println("***((/ / ^ 0 ^ / / ))***\n\nAchievement: move forward one position.");
                    String a8 = in.nextLine();
//zz for exiting the third while loop
                    zz="1";
                    zx="1";
                  }

                }
              }
        if  (h.equals("2")){
//while loop for return the statement in hard, if player chooses the wrong topic they want in hard list
          String zq= "0";
          String ml=middle.get(rand.nextInt(middle1));
          while (zq.equals("0")){
            Scanner in882= new Scanner(System.in);
            System.out.println("Wooo, bravo!! You choose the middle one: "+ ml+"\nIf you regret, please enter 0.\nIf not, PLEASE ENTER 1");
            String m1 = in.nextLine();
//this if statement is for returning to choose from hard list again
                        if(m1.equals("0")){
                          zq= "1" ;
                          zx= "1";
                        }
//story of middle
                        if(m1.equals("1")){
                            Scanner in92= new Scanner(System.in);
                            System.out.println("The line becomes longer when you are hesitated.(press enter)");
                            String c11 = in.nextLine();
                            System.out.println("Can't wait, you need coffee right now.(press enter)");
                            String c21 = in.nextLine();
                            System.out.println("So you decide to talk with Rose, the last person in line.(press enter)");
                            String c1 = in.nextLine();

                            Scanner in110= new Scanner(System.in);
                            System.out.println("You: Hey Rose, how's going?(press enter)");
                            String c2 = in.nextLine();

                            Scanner in111= new Scanner(System.in);
                            System.out.println("Rose: Pretty awesome.(press enter)");
                            String c3 = in.nextLine();

                            Scanner in112= new Scanner(System.in);
                            System.out.println("You: Do you know "+ml+"?(press enter)");
                            String c4 = in.nextLine();

                            Scanner in113= new Scanner(System.in);
                            System.out.println("Rose: "+ ml +"? Yes.(press enter)");
                            String c5 = in.nextLine();

                            Scanner in114= new Scanner(System.in);
                            System.out.println("You: My new program is about that, can you help me to think some fun facts about it?(press enter)");
                            String c12 = in.nextLine();


                            Scanner in115= new Scanner(System.in);
                            System.out.println("Rose looks at her cup: Okay, hummm...(press enter)");
                            String c13 = in.nextLine();
                            Scanner in116= new Scanner(System.in);
                            System.out.println("                       I think I might have time tonight. (press enter)");
                            String c16 = in.nextLine();
                            Scanner in117= new Scanner(System.in);
                            System.out.println("                       How about let's eat dinner together?(press enter)");
                            String c17 = in.nextLine();


                            Scanner in118= new Scanner(System.in);
                            System.out.println("***((/ / ^ 0 ^ / / ))***\n\nAchievement: Dinner with Rose.");
                            String c18 = in.nextLine();
        //zz for exiting the third while loop
                            zq="1";
                            zx="1";
                          }
                        }
                      }



      if (h.equals("3")){
        String zk= "0";
        String nl=normal.get(rand.nextInt(normal1));
        while (zk.equals("0")){
          Scanner in9000= new Scanner(System.in);
          System.out.println("Wooo, bravo!! You choose the normal one: "+ nl+"\nIf you regret, please enter 0.\nIf not, PLEASE ENTER 1");
          String s1 = in.nextLine();
//this if statement is for returning to choose from hard list again
                      if(s1.equals("0")){
                        zk = "1" ;
                        zx = "1" ;
                      }
//story of middle
                      if(s1.equals("1")){
                          Scanner in120= new Scanner(System.in);
                          System.out.println("The line becomes longer when you are hesitated.(press enter)");
                          String d1 = in.nextLine();
                          System.out.println("Can't wait, you need coffee right now.(press enter)");
                          String d2 = in.nextLine();
                          System.out.println("So you decide to talk with Poplar, the last person in line.(press enter)");
                          String d3 = in.nextLine();

                          Scanner in121= new Scanner(System.in);
                          System.out.println("You: Hey Poplar, how's going?(press enter)");
                          String d4 = in.nextLine();

                          Scanner in122= new Scanner(System.in);
                          System.out.println("Poplar: Pretty awesome.(press enter)");
                          String d5 = in.nextLine();

                          Scanner in123= new Scanner(System.in);
                          System.out.println("You: Can you describe "+nl+" for me?(press enter)");
                          String d6 = in.nextLine();

                          Scanner in124= new Scanner(System.in);
                          System.out.println("Poplar: "+ nl +"? Just search online.(press enter)");
                          String d7 = in.nextLine();


                          Scanner in125= new Scanner(System.in);
                          System.out.println("You: Oh, thank you!!!(press enter)");
                          String d8 = in.nextLine();


                          Scanner in126= new Scanner(System.in);
                          System.out.println("***((/ / ^ 0 ^ / / ))***\n\nAchievement: Knowlege from Wikipedia.");
                          String d9 = in.nextLine();
      //zz for exiting the third while loop
                          zk="1";
                          zx= "1";
                        }
                      }
                    }

      if (h.equals("4")){
        String zo= "0";
        String ll=low.get(rand.nextInt(low1));
        while (zo.equals("0")){
          Scanner in9111= new Scanner(System.in);
          System.out.println("Okay. You choose the low risk: "+ ll+"\nIf you regret, please enter 0.\nIf not, PLEASE ENTER 1");
          String ssd = in.nextLine();
  //this if statement is for returning to choose from hard list again
                      if(ssd.equals("0")){
                        zo = "1" ;
                        zx= "1";
                      }
  //story of middle
                      if(ssd.equals("1")){
                          Scanner in990= new Scanner(System.in);
                          System.out.println("The line becomes longer when you are hesitated.(press enter)");
                          String g1 = in.nextLine();
                          System.out.println("Can't wait, you need coffee right now.(press enter)");
                          String g2 = in.nextLine();
                          System.out.println("So you decide to talk with Cat, the last person in line.(press enter)");
                          String g3 = in.nextLine();

                          Scanner in991= new Scanner(System.in);
                          System.out.println("You: Hey Cat, how's going?(press enter)");
                          String g4 = in.nextLine();

                          Scanner in992= new Scanner(System.in);
                          System.out.println("Cat: Pretty awesome.(press enter)");
                          String g5 = in.nextLine();

                          Scanner in973= new Scanner(System.in);
                          System.out.println("You: Do you know how to spell "+ll+"?(press enter)");
                          String g6 = in.nextLine();

                          Scanner in945= new Scanner(System.in);
                          System.out.println("Rose: "+ ll +"? No.(press enter)");
                          String g7 = in.nextLine();

                          Scanner in944= new Scanner(System.in);
                          System.out.println("You: It is really hard, right?(press enter)");
                          String g8 = in.nextLine();


                          Scanner in949= new Scanner(System.in);
                          System.out.println("Rose looks at his cup: Yes, hummm...(press enter)");
                          String g9 = in.nextLine();
                          Scanner in939= new Scanner(System.in);
                          System.out.println("                       I think I might need to learn more. (press enter)");
                          String g10 = in.nextLine();
                          Scanner in929= new Scanner(System.in);
                          System.out.println("                       Thank you, see you.(press enter)");
                          String g11 = in.nextLine();


                          Scanner in91= new Scanner(System.in);
                          System.out.println("***((/ / ^ 0 ^ / / ))***\n\nAchievement: Nothing...");
                          String a1 = in.nextLine();

      //zz for exiting the third while loop
                          zo="1";
                          zx= "1";
                        }
                      }
                    }

      if (h.equals("x")){
        ArrayList<String> xx =new ArrayList<>();
        xx.add("apple");
        xx.add("pear");
        xx.add("chocolate");
        xx.add("mango");
        int xxl=xx.size();
        String zs= "0";
        String xl=xx.get(rand.nextInt(xxl));
        while (zs.equals("0")){
          Scanner in98888= new Scanner(System.in);
          System.out.println("Wooo, bravo!! You choose the middle one: "+ xl+"\nIf you regret, please enter 0.\nIf not, PLEASE ENTER 1");
          String x1 = in.nextLine();
  //this if statement is for returning to choose from hard list again
                      if(x1.equals("0")){
                        zs = "1" ;
                        zx= "1";
                      }
  //story of middle
                      if(x1.equals("1")){
                          Scanner in1000= new Scanner(System.in);
                          System.out.println("The line becomes longer when you are hesitated.(press enter)");
                          String x68 = in.nextLine();
                          System.out.println("Can't wait, you need coffee right now.(press enter)");
                          String x2 = in.nextLine();
                          System.out.println("So you decide to talk with Jack, the last person in line.(press enter)");
                          String u1 = in.nextLine();

                          Scanner in1101= new Scanner(System.in);
                          System.out.println("You: Hey Dora, how's going?(press enter)");
                          String u2 = in.nextLine();

                          Scanner in9801= new Scanner(System.in);
                          System.out.println("Dora: Pretty awesome.(press enter)");
                          String u3 = in.nextLine();

                          Scanner in9702= new Scanner(System.in);
                          System.out.println("You: Do you like "+xl+"?(press enter)");
                          String u4 = in.nextLine();

                          Scanner in9603= new Scanner(System.in);
                          System.out.println("Dora: "+xl + "? Yes, I love it.(press enter)");
                          String u5 = in.nextLine();

                          Scanner in9504= new Scanner(System.in);
                          System.out.println("You: Do you want it? I have some.(press enter)");
                          String j3 = in.nextLine();


                          Scanner in9405= new Scanner(System.in);
                          System.out.println("Dora looks at his cup: You are so nice!!!(press enter)");
                          String j5 = in.nextLine();


                          Scanner in9106= new Scanner(System.in);
                          System.out.println("***((o0> <0o))***\n\nLost a bag of "+xl);
                          String j8 = in.nextLine();

      //zz for exiting the third while loop
                          zs="1";
                          zx= "1";
                        }
                      }


}
else{
  zx="1";}
}

if (h.equals("0")){
zy = "1";
      }
    }
  }
}
