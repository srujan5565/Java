public class Binary_Search {
public static void main(String[] args) {
    int[] arr = {2, 5, 8, 12, 16,18};
    int key=81;
    System.out.println(binsearch(arr,key));
    System.out.println(recbinsearch(arr,key,0,arr.length-1));
}
public static boolean binsearch(int[] arr,int key){
    int l=0,r=arr.length-1,mid; //mid = start + (end - start) / 2
    while(l<=r){
        mid=(l+r)/2;
        if(arr[mid]==key) return true;
        else if(arr[mid]>key) l=mid+1;
        else r=mid-1;
    }
    return false;
}
public static boolean recbinsearch(int[] arr,int key,int l,int r){
    if(l>r) return false;
    int mid=l+(r-l)/2;
    if(arr[mid]==key) return true;
    else if(arr[mid]>key) recbinsearch(arr, key, mid+1, r);
    else recbinsearch(arr, key, l, mid-1);
    return false;
}
}


