public class pe25 {
    public static void main(String[] args) {
     long i =0;
     for(i=0;;i++)
     {
        System.out.println(fib(i));
     }
    }
    public static long fib(long num)
    {
        if(num==1 || num==0)
        return 1;
        else 
        return fib(num-1)+fib(num-2);
    }
}
