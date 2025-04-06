import java.util.Scanner;
public class prime_cv {
    public static void main(String[] args) {
        int n,rem=Integer.MAX_VALUE,flag=0;
        int arr[]=new int[11];
        System.out.println("Enter the number of ele: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        if(arr[i]<rem)
        rem=arr[i];
        int count=0;
        for(int i=3;i<100;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==rem)
                continue;
                if(i%arr[j]==rem)
                count++;
            }
            if(count==n-1 && isPrime(i))
            {
                System.out.println(i);
                return;
            }
            else
            count=0;
        }
        System.out.println("None");
    }
    public static boolean isPrime(int x)
    {
        int count=0;
        for(int i=1;i<=x/2;i++)
        if(x%i==0)
        count++;
        if(count==1)
        return true;
        else
        return false;
    }
}
