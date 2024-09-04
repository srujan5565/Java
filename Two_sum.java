import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int arr[]={3,34,4,12,5,2};
        int target=36,flag=0;
        usingDP(arr,target);
        for(int i=0;i<arr.length;i++)
        {
            if(bs(arr,target-arr[i])){
            System.out.println("True");
            flag=1;
            break;
            }
        }
        if(flag==0) System.out.println("False");
    }
    public static boolean bs(int arr[],int n){
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr,n);
        if(index>=0 && index<arr.length) return true;
        else return false;
    }
    public static void usingDP(int arr[],int target){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][target+1];
        dp[0][0]=true;
        for (int i = 0; i <=n; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i <=target; i++) {
            dp[0][i]=false;
        }
        //fill
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(arr[i-1]>j) dp[i][j]=dp[i-1][j];
                else dp[i][j] =dp[i-1][j] || dp[i-1][j-arr[i-1]];
            }
        }
    }
}
