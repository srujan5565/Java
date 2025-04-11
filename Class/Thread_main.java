class MyThread
{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Old thread name : "+t);
        t.setName("cse3");
        System.out.println("Old thread name : "+t);
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}