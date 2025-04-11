class sll_demo
{
    Node first= null;
    class Node//self referential
    {
        String item;
        Node next;
    }
    boolean isEmpty()
    {
        return first==null;
    }
    void push(String item)
    {
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
    }
    void pop()
    {
        first=first.next;
    }
    void print()
    {
        Node ptr=first;
        while(ptr!=null)
        {
            System.out.println(ptr.item);
            ptr=ptr.next;
        }
    }
}
public class stack_ll {
    public static void main(String args[])
    {
        sll_demo sd=new sll_demo();
        sd.push("to");
        sd.push("be");
        sd.push("or");
        sd.push("not");
        sd.push("to");
        sd.pop();
        sd.push("be");
        sd.pop();
        sd.pop();
        sd.push("that");
        sd.pop();
        sd.pop();
        sd.pop();
        sd.push("is");
        sd.print();
    }
}
