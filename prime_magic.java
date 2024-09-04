public class prime_magic {
    public static void main(String[] args) {
        int range=100,sum=2;
        for(int i=3;i<range;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
                if(isPrime(sum))
                System.out.println(sum);
            }
        }
    }
    public static boolean isPrime(int p)
    {
        int count=0;
        for(int i=1;i<p;i++){
            if(p%i==0)
            count++;
        }
        if(count==1)
        return true;
        else
        return false;
    }
}
