import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class IaTest extends JFrame{
static JFrame f = new JFrame();
static JFrame f2= new JFrame();
static JFrame f3= new JFrame();
JButton button =new JButton("Teacher");
JButton b =new JButton("Student");
public IaTest(){
      setSize(400,200);
      setTitle("Dorm Run Arrangement");
      Label l1=new Label("Welcome.");
      add(button,BorderLayout.CENTER);
      add(b, BorderLayout.LINE_END);
      add(l1,BorderLayout.LINE_START);
      thehandler handler = new thehandler();
      button.addActionListener(handler);
      setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


  private class Thehandler implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e){
       if(e.getSource()==button)
       {
           dispose();
           F2 frame2=new F2();
       }

       }
   }

}

   
