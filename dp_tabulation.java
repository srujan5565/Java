import java.util.HashMap;

public class dp_tabulation {
    public static void main(String[] args) {
        for(int i=1;i<8;i++)
       System.out.println(fibo(i));
        
    }
    public static int fibo(int n){
        int table[]=new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<n+1;i++)
        table[i]=table[i-2]+table[i-1];
        return table[n];
    }
}
