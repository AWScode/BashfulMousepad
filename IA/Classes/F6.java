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
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class F6 extends JFrame{
  String s2= new String();
  String s3= new String();
  String s4=new String();
  String s7=new String();
  boolean x=true;
 JButton b6 =new JButton("Return");
JButton b7 =new JButton("save");
TextField t4= new TextField();
TextField t6= new TextField();

public F6(){
  setSize(700,300);
  setTitle("Student");
  Label l4=new Label("enter the date(MMdd)");
  Label l6=new Label("enter the place");
  Container contentPane = getContentPane();
  SpringLayout layout = new SpringLayout();
  contentPane.setLayout(layout);
  Spring yPadding1=(Spring.constant(20));
  SpringLayout.Constraints springconstraints1=new SpringLayout.Constraints();
  springconstraints1.setY(yPadding1);
    contentPane.add(l4,springconstraints1);
  Spring yPadding2=(Spring.constant(30));
    SpringLayout.Constraints springconstraints2=new SpringLayout.Constraints();
    springconstraints2.setY(yPadding1);
      contentPane.add(t4,springconstraints2);
  Spring yPadding3=(Spring.constant(40));
    SpringLayout.Constraints springconstraints3=new SpringLayout.Constraints();
    springconstraints3.setY(yPadding1);
      contentPane.add(l6, springconstraints3);
  Spring yPadding4=(Spring.constant(260));
    SpringLayout.Constraints springconstraints4=new SpringLayout.Constraints();
    springconstraints4.setY(yPadding1);
      contentPane.add(t6, springconstraints4);
      setLayout(new GridLayout(6,6,6,6));



  add(b7, BorderLayout.PAGE_END);
  add(b6, BorderLayout.PAGE_START);
  Thehandler handler = new Thehandler();
  b6.addActionListener(handler);
  b7.addActionListener(handler);
  s2=t4.getText();
  s4=t6.getText();
  s3=s2+" "+s4;
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);

}

private void cretateFile(){
  File file=new File("studentRecords.rtf");

  String myStr = "";
  try{
    Scanner input= new Scanner(file);
    while(input.hasNextLine()){
      myStr=input.nextLine();
      if(myStr.equals(s3)){
      x=true;
    }
  }
}
  catch(Exception z){
    z.printStackTrace();
  }



  if(myStr.equals(s3)){
    x=true;
  }
  else{
    x=false;
  }
}




private class Thehandler implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
  if(e.getSource()==b7)
  {
    File file = new File("studentRecords.rtf");
    File dest = new File("studentRecords.rtf");
try {
    BufferedReader reader = new BufferedReader(new FileReader(file));
    BufferedWriter writer  = new BufferedWriter(new FileWriter(dest));
    String line = reader.readLine();
    while(line!=null){
        writer.write(s3);
        line = reader.readLine();
    }
    writer.flush();
    reader.close();
    writer.close();
} catch (FileNotFoundException e1) {
    e1.printStackTrace();
} catch (IOException e2) {
    e2.printStackTrace();
}
t4.setText("");
t6.setText("");
setVisible(true);
    }
   else if (e.getSource()==b6){
     dispose();
     IaTest frame1 = new IaTest();
   }
}
}

}
