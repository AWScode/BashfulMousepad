import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
public class F7 extends JFrame{
  JButton b11 =new JButton("Return");
  String s13= new String();
  ArrayList<String> studentLabel=new ArrayList<String>();
  ArrayList<String> otherlabel=new ArrayList<String>();
  ArrayList<String> three=new ArrayList<String>();
  private Random randomGenerator;
  public void kk(String a){
    s13=a;
  }
public F7(){
  setSize(700,300);
  setTitle("recommendation");
  Label l14=new Label("121");
  Label l15=new Label("");
  Label l16=new Label("");
  Container contentPane = getContentPane();
  SpringLayout layout = new SpringLayout();
  contentPane.setLayout(layout);
  Spring yPadding1=(Spring.constant(20));
  SpringLayout.Constraints springconstraints1=new SpringLayout.Constraints();
  springconstraints1.setY(yPadding1);
  contentPane.add(l14,springconstraints1);
  Spring yPadding2=(Spring.constant(30));
  SpringLayout.Constraints springconstraints2=new SpringLayout.Constraints();
  springconstraints2.setY(yPadding1);
  contentPane.add(l15,springconstraints2);
  Spring yPadding3=(Spring.constant(40));
  SpringLayout.Constraints springconstraints3=new SpringLayout.Constraints();
  springconstraints3.setY(yPadding1);
  contentPane.add(l16, springconstraints3);
    setLayout(new GridLayout(6,6,6,6));
    add(b11, BorderLayout.PAGE_START);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void createFile(){

  File file=new File("StudentsRecords.rtf");

  try{
    Scanner input= new Scanner(file);
    String lineFromFile = input.nextLine();
    while(input.hasNextLine()){
      if(lineFromFile.contains(s13)){
      studentLabel.add(lineFromFile.substring(5,(lineFromFile.length()-1)));
    }
  }
}
  catch(Exception z){
    z.printStackTrace();
  }
}
public void createRandomfile(){
  File file=new File("OtherIterms.rtf");

  try{
    Scanner input= new Scanner(file);
    String lineFromFile = input.nextLine();
    while(input.hasNextLine()){
    otherlabel.add(lineFromFile);
    }
  }
  catch(Exception e){
    e.printStackTrace();
  }
}
public void chooseLabel(){
  String o= s13.substring(0,2);
  int stuNum = studentLabel.size();
  if(stuNum==3){
    l14=new Label("Recommendation 1: "+studentLabel.get(0).toString());
    l15=new Label("Recommendation 2: "+studentLabel.get(1).toString());
    l16=new Label("Recommendation 3: "+studentLabel.get(2).toString());
  }
  else if(o.equals("09")){
    if(studentLabel.contains("target")){
      studentLabel.remove("target");
      }
    stuNum=studentLabel.size();
    if(stuNum==0){
    l14=new Label("Recommendation 1: target");
    otherlabel.remove("target");
    three=(ArrayList<String>)otherlabel.clone();
    int index = randomGenerator.nextInt(three.size());
    l15=new Label("Recommendation 2: "+three.get(index).toString());
    three.remove(index);
    three=(ArrayList<String>)three.clone();
    int index2 = randomGenerator.nextInt(three.size());
    l16=new Label("Recommendation 3: "+three.get(index2).toString());
    }
    else if(stuNum==1){
      l14=new Label("Recommendation 1: target");
      otherlabel.remove("target");
      three=(ArrayList<String>)otherlabel.clone();
      int index = randomGenerator.nextInt(three.size());
      l15=new Label("Recommendation 2: "+three.get(index).toString());
      l16=new Label("Recommendation 3: "+studentLabel.get(0).toString());
    }
    else if(stuNum==2){
      l14=new Label("Recommendation 1: target");
      l15=new Label("Recommendation 2: "+studentLabel.get(0).toString());
      l16=new Label("Recommendation 3: "+studentLabel.get(1).toString());
    }
    else{
      int index = randomGenerator.nextInt(otherlabel.size());
      l14=new Label("Recommendation 1: "+otherlabel.get(index).toString());
      otherlabel.remove(index);
      three=(ArrayList<String>)otherlabel.clone();
      int index1 = randomGenerator.nextInt(three.size());
      l15=new Label("Recommendation 2: "+otherlabel.get(index1).toString());
      three.remove(index1);
      three=(ArrayList<String>)three.clone();
      int index2 = randomGenerator.nextInt(three.size());
      l16=new Label("Recommendation 3: "+three.get(index2).toString());
    }
  }
  else if(stuNum>3){
    int index = randomGenerator.nextInt(studentLabel.size());
    l14=new Label("Recommendation 1: "+studentLabel.get(index).toString());
    studentLabel.remove(index);
    three=(ArrayList<String>)studentLabel.clone();
    int index1 = randomGenerator.nextInt(three.size());
    l15=new Label("Recommendation 2: "+otherlabel.get(index1).toString());
    three.remove(index1);
    three=(ArrayList<String>)three.clone();
    int index2 = randomGenerator.nextInt(three.size());
    l16=new Label("Recommendation 3: "+three.get(index2).toString());
  }
  else if(stuNum==1){
    int index = randomGenerator.nextInt(otherlabel.size());
    l14=new Label("Recommendation 1: "+otherlabel.get(index).toString());
    otherlabel.remove(index);
    three=(ArrayList<String>)otherlabel.clone();
    int index1 = randomGenerator.nextInt(three.size());
    l15=new Label("Recommendation 2: "+three.get(index1).toString());
    l16=new Label("Recommendation 3: "+studentLabel.get(0).toString());}
  else if(stuNum==2){
    int index = randomGenerator.nextInt(otherlabel.size());
    l14=new Label("Recommendation 1: "+otherlabel.get(index).toString());
    l15=new Label("Recommendation 2: "+studentLabel.get(0).toString());
    l16=new Label("Recommendation 3: "+studentLabel.get(1).toString());

  }
}
private class Thehandler implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
  if(e.getSource()==b11){
  dispose();
   F4 frame1 = new F4();}
 }
}

}
