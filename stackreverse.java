import java.util.Stack;

public class stackreverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};

        
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<arr.length;i++)
        st1.push(arr[i]);
        while(!st1.isEmpty())
        st2.push(st1.pop());
        System.out.println(st2);
    }
}
