class stack_demo
{
    int i=0;
    String arr[]=new String[10];
    void push(String item)
    {
        arr[i]=item;
        i++;
    }
    String pop()
    {
        return arr[--i];
    }
    boolean isEmpty()
    {
        if(i==0)
        return false;
        else return true;
    }
    void print()
    {
        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
class stack_pro
{
    public static void main(String[] args) {
        stack_demo sd=new stack_demo();
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