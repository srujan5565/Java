class MyThreadR implements Runnable
{
    Thread t;
    MyThreadR()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("child "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class MyThreadRM
{
    public static void main(String[] args) {
        MyThreadE mte =new MyThreadE();
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("parent "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}