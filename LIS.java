import java.lang.reflect.Array;
import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int arr[]={10,9,2,5,3,7,101,18};
        int n=arr.length,maxlength=1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    maxlength=Math.max(maxlength,dp[i]);
                }
            }
        }
        System.out.println(dp[n]);
    }
}
