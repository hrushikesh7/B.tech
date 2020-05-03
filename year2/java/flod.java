import java.awt.*;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
class flod extends JFrame 
{
    flod() 
    {
        Container c= getContainerpane();
        flod obj = new flod(flod.RIGHT,10,10);
        c.setLayout(obj);
        JButton b1,b2,b3;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        c.add(b1);
        c.add(b2);
        c.add(b3);
    }
}
public static void main(string args[])
{
    flod d = new flod();
    d.setSize(400,300);
    d.setTitle("FLOW LAYOUT");
    d.setVisible(true);
    d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}