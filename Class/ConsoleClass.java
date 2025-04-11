import java.io.Console;
public class ConsoleClass {
    public static void main(String[] args) 
     {
        Console c= System.console();
        String s;
        System.out.println("Enter username : ");
        s=c.readLine();
        System.out.println("Enter Password : ");
        char ch[]=c.readPassword();
        String p=String.valueOf(ch);
        System.out.println(s+"  "+p);
    }
}
