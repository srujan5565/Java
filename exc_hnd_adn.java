public class exc_hnd_adn {
    public static void main(String[] args) {
        String val="10+5";
        String arr[]=val.split("+");
        try{
            int a=Integer.parseInt(arr[0]);
            int b=Integer.parseInt(arr[1]);
            System.out.println(a+b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
