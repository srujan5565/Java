import java.util.*;
public class hashmap_ex {
    public static void main(String args[]){
        // int nums1[]={1,2,3,1};
        int nums1[]={1,2,3,1,2,3};
        int k=2;
        for(int i=0;i<nums1.length;i++)
        for(int j=0;j<nums1.length;j++)
        {
            if(i!=j && nums1[i]==nums1[j] && Math.abs(i-j)<k)
            {
                System.out.println(true);
                return;
            }
        }
        /* 
        if(hash.containsKey(arr[i]) && hash.get(arr[i])-i<=k){flag=true;} 


        */
        System.out.println(false);
    }
}
