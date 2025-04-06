
package Java.OOPsConceptPrograms;
import java.util.ArrayList;

public class merge_sort {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        int arr[]={1,4,6,9,11,13,-1,3,10,11,14};
        int low=0,high=arr.length-1,mid=1+(low+high)/2;
        // if(arr.length%2==0) mid++;
        // System.out.println(mid);
        int i=low,j=mid;
        int aux[]=new int[arr.length];
        for(int k=0;k<arr.length;k++)
        aux[k]=arr[k];
        for(int k=0;k<arr.length;k++)
        {
            if(i>=mid)
            {
                arr[k]=aux[j];
                j++;
            }
            else if(j>high)
            {
                arr[k]=aux[i];
                i++;
            }
            else if(aux[i]<=aux[j])
            {
                arr[k]=aux[i];
                i++;
            }
            else 
            {
                arr[k]=aux[j];
                j++;
            }
            
        }
        for(int k=0;k<arr.length;k++)
        System.out.print(arr[k]+" ");
    }
}
