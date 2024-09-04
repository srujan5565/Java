public class dp_perfectsquare {
    public static void main(String[] args) {
        int ps[]={1,4,9,16};
        int sum=12;
        System.out.println(findCount(sum));
    }

    public static int findCount(int n) {
       int dp[]=new int[n+1];
       for(int i=0;i<=n;i++){
        dp[i]=i;
        for(int j=1;j*j<=i;j++)
        dp[i]=Math.min(dp[i],dp[i-j*j]+1);
       }
       return dp[n];
    }
}
