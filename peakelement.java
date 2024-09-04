public class peakelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        for(int i=1;i<arr.length-1;i++)
        if(arr[i-1]<arr[i] && arr[i]> arr[i+1])
        System.out.println("index = "+i);
    }
}
