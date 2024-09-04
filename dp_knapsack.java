public class dp_knapsack {
public static void main(String[] args) {
    int weights[]={2,3,4,5};
    int values[]={3,4,5,7};
    int W=7,n=weights.length;
    int M[][]=new int[n+1][W+1];
    for(int i=1;i<=n;i++){
        for(int w=1;w<=W;w++){
            if(w>=weights[i-1])
            M[i][w]=Math.max(M[i-1][w],M[i-1][w-weights[i-1]]+values[i-1]);
            else
            M[i][w]=M[i-1][w];
        }
    }
    for(int i=0;i<n+1;i++)
    {
        for(int j=0;j<W+1;j++)
        System.out.print(M[i][j]+" ");
        System.out.println();
    }
}
}
