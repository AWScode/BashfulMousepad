import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
public class F2 extends JFrame{
  JButton b2 =new JButton("Enter");
  JButton b3 =new JButton("Return");
  public F2(){
      setSize(400,200);
      setTitle("Teacher");
      Label l2=new Label("Password");
      TextField t1= new TextField();
      add(t1,BorderLayout.CENTER);
      add(b2, BorderLayout.LINE_END);
      add(l2,BorderLayout.LINE_START);
      add(b3,BorderLayout.PAGE_START);
      thehandler handler = new thehandler();
      b2.addActionListener(handler);
      b3.addActionListener(handler);
      setVisible(true);
      String s1=t1.getText();
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
      private class Thehandler implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2||s1.equals("2018reds")){
        dispose();
         F3 frame3= new F3();
       }
     }
      }
    }
