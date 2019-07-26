import javax.swing.*;
import java.awt.event.*;

public class Button extends JFrame implements ActionListener{

  JButton button1;
  
  public Button(){
   
    setLayout(null);
    button1 = new JButton("Close");
    button1.setBounds(300,250, 100, 30);
    add(button1);
    button1.addActionListener(this);
   }

  public void actionPerformed(ActionEvent event){
   
    if(event.getSource() == button1){
      System.exit(0);
    }
 }

  public static void main(String args[]){

    Button interfaz = new Button();
    interfaz.setBounds(0,0,450,350);
    interfaz.setVisible(true);
    interfaz.setLocationRelativeTo(null);
    interfaz.setResizable(false);
 }
}