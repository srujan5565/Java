class queue_demo
{
    Node first=null,last;
    boolean isEmpty()
    {
        return first==null;
    }
    class Node
    {
        String item;
        Node next;
    }
    void enqueue(String item)
    {
        Node oldlast=last;
        last=new Node();
        last.item=item;
        if(isEmpty())
        first=last;
        else
        oldlast.next=last;
        last.next=null;
    }
    void dequeue()
    {
        first=first.next;
        if(isEmpty()) last=null;
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
public class queue {
    public static void main(String[] args) {
        queue_demo qd=new queue_demo();
        qd.enqueue("to");
        qd.enqueue("be");
        qd.enqueue("or");
        qd.enqueue("not");
        qd.enqueue("to");
        qd.dequeue();
        qd.enqueue("be");
        qd.dequeue();
        
        qd.print();
    }
}


