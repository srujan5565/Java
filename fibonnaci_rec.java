public class fibonnaci_rec {
    public static void main(String args[])
    {
        
        System.out.println(fibo(6));
    }
    public static int fibo(int n)
    {
        if(n==1)
        return 1;
        if(n==0)
        return 0;
        return fibo(n-1)+fibo(n-2);
    }
}
