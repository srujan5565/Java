public class Static {
    static int a=10;
    static int b=20;
    static{
        b=a+b;
    }
    public static void main(String[] args) {
        System.out.println(b);
    }
}
