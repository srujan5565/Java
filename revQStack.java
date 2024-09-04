import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class revQStack {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++){q.add(i);}
        System.out.println(q);
        for(int i=0;i<5;i++){st.push(q.poll());}
        while(!st.isEmpty()){q.add(st.pop());}
        System.out.println(q);
    }
}
