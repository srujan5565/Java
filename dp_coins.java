public class dp_coins {
    public static void main(String[] args) {
        int coins[]={1,2,5};
        int N=5,n=3;
        System.out.println(comb(coins,N,n));
        
    }
    public static int comb(int coins[],int N,int n){
        int table[]=new int[N+1];
        table[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=N;i++)
            {
                table[i]+=table[i-coin];
            }
        }
        return table[N];
        // int i=0;
        // while(N>0 && i<coins.length)
        // {
        // comb(coins,N-coins[i],res+coins[i]);
        // System.out.print(coins[i]);
        // i++;
        // }
        }
    }

