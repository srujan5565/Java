public class produ_consu {
    int n;
    boolean valueset=false;
    synchronized void get()
    {
        if(!valueset)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("got :"+n);
        valueset=false;
        notify();
    }
    synchronized void put(int n)
    {
        if(valueset)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        this.n=n;
        valueset=true;
        System.out.println("put :"+n);
        notify();
    }
}
class producer implements Runnable
{
    produ_consu p;
    producer(produ_consu p)
    {
        this.p=p;
        new Thread(this,"producer").start();
    }
    public void run()
    {
        int i=0;
        while(i<=10)
        {
            p.put(i++);
        }
    }
}
class consumer implements Runnable
{
    produ_consu p;
    consumer(produ_consu p)
    {
        this.p=p;
        new Thread(this,"consumer").start();
    }
    public void run()
    {
        int i=0;
        while(i<=10)
        {
            p.get();
        }
    }
}
class IPCDemo
{
    public static void main(String[] args) {
        produ_consu t=new produ_consu();
        new producer(t);
        new consumer(t);
    }
}
