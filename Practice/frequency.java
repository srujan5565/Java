import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 2, 5, 4};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:arr) freq.put(num,freq.getOrDefault(num,0)+1);
        System.out.println(freq.toString());
        System.out.println("======");

        for(int num:freq.keySet()){
            System.out.println(num+" -> "+freq.get(num));
        }
        //OR
        System.out.println("======");
        for(Map.Entry<Integer,Integer> num:freq.entrySet()){
            System.out.println(num.getKey()+" -> "+num.getValue());
        }
    }
}
