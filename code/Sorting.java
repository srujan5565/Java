public class Sorting {
    public static void main(String[] args) {
        int arr[]={1,4,13,6,2,1,-1,8};
        //Selection(arr);
        //Insertion(arr);
        //Shell(arr);
        Merge();
    }

    // public static void Selection(int arr[]){
    //     int min;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         min=i;
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             if(arr[j]<arr[min])
    //             min=j;
    //         }
    //         int temp=arr[i];
    //         arr[i]=arr[min];
    //         arr[min]=temp;
    //     }
    //     for(int i=0;i<arr.length;i++)
    //     System.out.print(arr[i]+" ");
    // }

    // public static void Insertion(int arr[])
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=i;j>0;j--)
    //         {
    //             if(arr[j]<arr[j-1])
    //             {
    //                 int temp=arr[j];
    //                 arr[j]=arr[j-1];
    //                 arr[j-1]=temp;
    //             }
    //             else break;
    //         }
    //     }
    //     for(int i=0;i<arr.length;i++)
    //     System.out.print(arr[i]+" ");
    // }

    // public static void Shell(int arr[])
    // {
    //     int h=0;
    //     while(h<arr.length/3) h=3*h+1;
    //     while(h>=1)
    //     {
    //         for(int i=h;i<arr.length;i++)
    //         {
    //             for(int j=i;j>=h;j-=h)
    //             {
    //                 if(arr[j]<arr[j-h])
    //                 {
    //                     int temp=arr[j];
    //                     arr[j]=arr[j-h];
    //                     arr[j-h]=temp;
    //                 }
    //             }
    //         }
    //         h=h/3;
    //     }
    //     for(int i=0;i<arr.length;i++)
    //     System.out.print(arr[i]+" ");
    // }

    public static void Merge()
    {
        int arr[]={1,5,9,11,19,2,4,7,12,17};//1st half and 2nd half should be sorted 
        //Here
        int low=0,mid=5,comp=mid;
        int aux[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        aux[i]=arr[i];
        for(int i=0;i<arr.length;i++)
        System.out.print(aux[i]+" ");
        for(int i=0;i<arr.length;i++)
        {
            if(mid<arr.length && arr[low]<=arr[mid])
            {
                aux[i]=arr[low];
                // System.out.println(arr[low]+"<="+arr[mid]);
                low++;
            }
            else if(mid<arr.length && arr[low]>arr[mid])
            {
                aux[i]=arr[mid];
                // System.out.println(arr[low]+">"+arr[mid]);
                mid++;
            }
        }
        if(low==comp)
        aux[arr.length-1]=Math.max(arr[low-1],arr[mid]);
        else
        aux[arr.length-1]=Math.max(arr[low],arr[mid-1]);
        System.out.println("");
        for(int i=0;i<arr.length;i++)
        System.out.print(aux[i]+" ");
        //Here the final array is aux but actually it should be arr
        //Exchange arr and aux in for loops
    }
}
