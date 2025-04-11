import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class cardLayoutExample extends JFrame implements ActionListener
{   
    CardLayout card;
    JButton b1,b2,b3;
    Container c; 
    cardLayoutExample()
    {
        c=getContentPane();
        card=new CardLayout(40,40);
        c.setLayout(card);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add(b1);c.add(b2);c.add(b3);
    }
    public void actionPerformed(ActionEvent e)
    {
        card.next(c);
    }
    public static void main(String[] args) {
        cardLayoutExample c=new cardLayoutExample();
        c.setSize(200, 200);
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
