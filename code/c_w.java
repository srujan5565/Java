import java.util.ArrayList;
public class c_w {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>(5);
        al.add(1);
        al.add(1);
        al.add(1);
        System.out.println( al.contains(2));
        al.set(2,3);
        System.out.println(al);
    }
}
