import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MML {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mouse Motion Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MouseMotionPanel panel = new MouseMotionPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}

class MouseMotionPanel extends JPanel implements MouseMotionListener {
    private int mouseX;
    private int mouseY;

    public MouseMotionPanel() {
        addMouseMotionListener(this);
        setPreferredSize(new Dimension(400, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Mouse X: " + mouseX, 10, 20);
        g.drawString("Mouse Y: " + mouseY, 10, 40);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint(); // Repaint the panel to update the mouse coordinates
    }
}
