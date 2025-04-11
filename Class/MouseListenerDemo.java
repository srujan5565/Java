import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class MouseListenerDemo extends JFrame implements MouseMotionListener
{
    //JLabel l;
    MouseListenerDemo()
    {
        addMouseMotionListener(this);
        //l=new JLabel();
        //l.setBounds(20,50,130,100);
       // add(l);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.MAGENTA);
        g.fillOval(e.getX(),e.getY(),10,10);
    }
    public void mouseMoved(MouseEvent e)
    {
        
    }
    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}
