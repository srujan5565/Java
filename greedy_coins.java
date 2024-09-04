public class greedy_coins {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,1000};
        int v=2300,count=0;
        for(int i=0;i<coins.length;i++){
            while(v>=coins[coins.length-i-1]){
                v=v-coins[coins.length-i-1];
                count++;
            }
            System.out.println(coins[coins.length-i-1]+" -> "+count);
            count=0;
        }
    }
}
