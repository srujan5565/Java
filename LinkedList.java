class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
    }
}
class LinkedListE{
    Node head=null,tail=null;
    void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    // Node temp=head;
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    void removeHead()
    {   
        head=head.next;
        display();
    }

    void removeTail()
    {
        Node prev=null,temp=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        tail=prev;
        tail.next=null;
        display();
    }
}
public class LinkedList {
public static void main(String[] args) {
    
    LinkedListE l=new LinkedListE();
    for(int i=0;i<5;i++) l.add(i);
    l.display();
    l.removeHead();
    l.removeTail();
}
}