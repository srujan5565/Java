//Checking whether the array is sorted using recursion..

public class array_sort_rec {
    public static boolean findSort(int arr[],int n)
    {
        if(n==0)
        return true;
        if(arr[n]>arr[n-1])
        return findSort(arr,n-1);
        
        return false;
    }
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={4,2,8,3,5,8};
        System.out.println(findSort(arr1,arr1.length-1));
        System.out.println(findSort(arr2,arr2.length-1));
    }
}
