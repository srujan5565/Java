import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class revQn {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        //Queue<Integer> q2=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        int k=4;
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){q1.add(arr[i]);}
        // for(int i=0;i<k;i++){s.push(q1.poll());}
        // for(int i=k;i<arr.length;i++){q2.add(q1.poll());}
        // for(int i=0;i<k;i++){q1.add(s.pop());}
        // for(int i=k;i<arr.length;i++){q1.add(q2.poll());}
        // System.out.println(q1);

        for(int i=0;i<k;i++){s.push(q1.poll());}
        for(int i=0;i<k;i++){q1.add(s.pop());}
        for(int i=k;i<arr.length;i++){q1.add(q1.poll());}
        System.out.println(q1);
    }
}
