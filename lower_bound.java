public class lower_bound {
    public static void main(String args[])
    {
        int arr[]={1,2,2,8,10,13,13,21,30};
        int k=13;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=k)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
