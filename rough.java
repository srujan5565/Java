public class rough {
    public static void main(String[] args) {
        int i=2,j=0;
        for(;;i++){
            if(isPrime(i) && i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
            {
                System.out.println(i);
                j++;
                if(j==10)
                break;
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
