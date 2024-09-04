import java.util.LinkedList;
import java.util.Stack;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<5;i++) ll.add(i);
        System.out.println(ll);
        for(int i=0;i<ll.size();i++)
        s.add(ll.get(i));
        for(int i=0;i<ll.size();i++){
            ll.removeFirst();
            ll.add(s.pop());
        }
        System.out.println(ll);
    }
}
