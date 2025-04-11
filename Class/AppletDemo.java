import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet
{
        public void init()
        {
            System.out.println("1");
        }
        public void start()
        {
            System.out.println("2");
        }
        public void stop()
        {
            System.out.println("3");
        }
        public void paint(Graphics g)
        {
            System.out.println("2");
        }
        public void destroy()
        {
            System.out.println("5");
        }
    
}
