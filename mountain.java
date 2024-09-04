
public class mountain {
 public static void main(String[] args) {
    int arr[]={5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
    int count=0,max=0;
    for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i+1] && arr[i-1]<arr[i]){
            int left=i,right=i+1;
            while( left>0 && arr[left]>arr[left-1] )
            left--;
            while(right<arr.length && arr[right]>arr[right+1] )
            right++;
            max=Math.max(max, right-left+1);
        }
    }
    System.out.println(max);
 }   
}
