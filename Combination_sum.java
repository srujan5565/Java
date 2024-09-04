import java.util.ArrayList;

public class Combination_sum {
    public static void main(String[] args) {    
        int arr[]={2,3,6,7};
        int sum=7;
        combsum(arr,sum);
    }
    public static ArrayList<Integer> combsum(int[] arr,int sum){
        ArrayList<Integer> res=new ArrayList<>();
        Findsum(arr,sum,res,0);
    }
    private static void Findsum(int[] arr, int sum, ArrayList<Integer> res, int i) {
        if(sum==0)
        res.add(arr[i]);
        if(sum<0)
        return;
        for
    }
}
