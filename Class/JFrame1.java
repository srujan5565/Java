import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JFrame1 extends JFrame
{
    JFrame1()
    {
        new JFrame();
        JButton b=new JButton("click");
        setSize(1000, 1000);
        add(b);
        b.setSize(80,80);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrame1();
    }
}
