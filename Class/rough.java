public class rough {
    static int a=0;
    rough(){
        a++;
    }
    public static void main(String[] args) {
        c2 c=new c2();
        c.run();
        
    }
}
class c2{
    rough r=new rough();
    void run(){
        System.out.println(rough.a);
    }
}
