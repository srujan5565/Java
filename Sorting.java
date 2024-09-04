public class Sorting {
    public static void main(String[] args) {
        int arr[]={3,5,2,5,5,12,4,7,6,-8};
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr,0,arr.length-1);
        for(int ele:arr) System.out.print(ele+" ");
    }

    public static void quickSort(int[] arr, int l, int r) {
        if(l<r){
            int pivotIndex=partition(arr,l,r);
            quickSort(arr, l, pivotIndex-1);
            quickSort(arr, pivotIndex+1, r);
        }
    }
    public static int partition(int[] arr, int l, int r) {
        int pivot=arr[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;
        return i+1;
    }
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){ // < for ascending
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }

    public static void recbubbleSort(int[] arr,int i,int j){
        if(i<arr.length){
            if(j<arr.length){
                if(arr[j]>arr[i]){ // < for ascending
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    }
                    recbubbleSort(arr, i, j+1);
            }
            recbubbleSort(arr, i+1, i+2);
        }
    }


    public static int[] mergeSort(int [] arr,int l,int r){  //TC -> O(nlogn)
        if(l<r){
        int mid=l+(r-l)/2;
        mergeSort(arr, l, mid); //left sub array
        mergeSort(arr, mid+1, r); //right sub array
        merge(arr,l,mid,r);
        }
        return arr;
    }
    public static void merge(int[] arr, int l, int mid, int r) {
        int llength=mid-l+1;
        int rlength=r-mid;
        int leftA[]=new int[llength];
        int rightA[]=new int[rlength];
        System.arraycopy(arr, l, leftA, 0, llength);
        System.arraycopy(arr, mid+1, rightA, 0, rlength);
        int i=0,j=0,k=l;
        while(i<llength && j<rlength){
            if(leftA[i]<=rightA[j]){
                arr[k]=leftA[i];
                i++;
            }
            else{
                arr[k]=rightA[j];
                j++;
            }
            k++;
        }
        while(i<llength){
            arr[k++]=leftA[i++];
        }while(j<rlength){
            arr[k++]=rightA[j++];
        }
    }
}
