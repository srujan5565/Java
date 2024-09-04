import java.util.*;
class digitsum{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int num,min=Integer.MAX_VALUE,sum=0,k=0;
    for(int i=0;i<n;i++)
    {
        num=arr[i];
        min=Integer.MAX_VALUE;
        while(arr[i]!=0)
        {
            k=arr[i]%10;
            if(k<min)
            min=k;
            arr[i]=arr[i]/10;
        }
        sum+=min;
    }
    System.out.println("sum = "+sum);
}
}
