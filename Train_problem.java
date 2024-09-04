import java.util.Arrays;

public class Train_problem {
    public static void main(String[] args) {
        int arrival[]={900,940,950,1100,1500,1800};
        int departure[]={910,1200,1120,1130,1900,2000};
        int minPlatforms=find(arrival,departure);
        System.out.println(minPlatforms);
    }

    private static int find(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform=0;
        int maxPlatforms=0;
        int departureIndex=0;
        int arrivalIndex=0;
        while(arrivalIndex<arrival.length && departureIndex<departure.length){
            if(arrival[arrivalIndex]<departure[departureIndex]){
                platform++;
                maxPlatforms=Math.max(maxPlatforms,platform);
                arrivalIndex++;
            }
            else{
                platform--;
                departureIndex++;
            }   
        }
        return maxPlatforms;
    }
}
