public class Fractional_Knapsack {
    public static void main(String[] args) {
        //should be arranged in the increasing ratio order
        //use custom comparator to sort 
        float price[]={60,100,120};
        float weight[]={10,20,30};
        float w=50,res=0;
        float ratio[]=new float[price.length];
        int i;
        for(i=0;i<price.length;i++){
            if(weight[i]>=w) break;
            ratio[i]=1;
            w=w-weight[i];
        }
        if(i<=price.length)
        ratio[i]=w/weight[i];
        for(int j=0;j<price.length;j++) 
        res+=ratio[i]*price[i];
        System.out.println(res);
    }
}
/*
 * import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Fractional_Knapsack {

   public static void main(String[] args) {
    int weights[]={10,20,30},values[]={60,100,120};
    int maxweight=50,val=0;
    TreeMap<Double,Double> itemMap =new TreeMap<>();
   for(int i=0;i<3;i++){
    itemMap.put((double)values[i]/weights[i],(double) weights[i]);
    //key=fractional, value=weight
   }
   System.out.println(getMax(itemMap,maxweight));
   }

  private static double getMax(TreeMap<Double, Double> itemMap, int maxweight) {
     double totalValue =0.0;
     for(Map.Entry<Double,Double> entry: itemMap.descendingMap().entrySet()){
      double ratio = entry.getKey();
      double weight = entry.getValue();
      if(maxweight==0) break;
      double val= ratio*weight; //6.0*10.0 =60.0
      if(weight<=maxweight){
        maxweight-=weight;
        totalValue+=val;
      }else{
        totalValue+=val*(maxweight/weight);
        //fraction of my weight
        maxweight=0;
      }
     }
    // System.out.println(itemMap);
    return totalValue;
  }

}
 */