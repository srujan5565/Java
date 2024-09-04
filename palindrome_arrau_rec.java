public class palindrome_arrau_rec {
    public static boolean pal_check(int arr[],int i,int j)
    {
        if(i>j)
        return true;
        if(arr[i]==arr[j])
        {
             return pal_check(arr,++i,--j);
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr1[]={3,0,1,0,3};
        int arr2[]={1,2,3,4,1};
        System.out.println(pal_check(arr1,0,arr1.length-1));
        System.out.println(pal_check(arr2,0,arr2.length-1));
    }
}
