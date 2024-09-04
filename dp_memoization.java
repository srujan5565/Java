import java.util.HashMap;

public class dp_memoization {
    public static void main(String[] args) {
        HashMap<Integer,Integer> cache=new HashMap<>();
        System.out.println(fibo(5,cache));
        
    }
    public static int fibo(int n,HashMap<Integer,Integer> cache){
        if(cache.containsKey(n))
        return cache.get(n);
        if(n==0 || n==1)
        return 1;
        int result=fibo(n-1, cache)+fibo(n-2, cache);
        cache.put(n,result);
        return result;
    }
}
