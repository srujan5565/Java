public class two_power {
    public static void main (String args[])
    {
        System.out.println(power(4));
    }
    public static int power(int n)
    {
        if(n==0)
        return 1;
        return 2*power(n-1);
    }
}
