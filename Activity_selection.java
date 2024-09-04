public class Activity_selection {
    public static void main(String[] args) {
        //sort the hashmap
        int time[][]={{1,3},{2,5},{4,7},{1,8},{5,9},{8,10}};
        int i=0,count=0,j=1;
        while(i+1<time.length-1){
            int prev=time[i][1];
            int next=time[j][0];
            if(prev<next){
                j++;
                i++;
                count++;
            }
            else{
                j++;
            }
            i++;
        }
        System.out.println(count);
    }
}
