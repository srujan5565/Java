import java.util.Stack;
class MyStack{
    Stack<Integer> stack=new Stack<>();
    void push(int val){stack.push(val);}
    void pop(){System.out.println(stack.pop() + "  Popped");}
}
public class Stack_DS {
    public static void main(String[] args) {
        MyStack ms=new MyStack();
        ms.push(0);
        ms.push(2);
        ms.push(1);
        System.out.println(ms.stack);
        ms.pop();
        System.out.println(ms.stack);
    }
}
