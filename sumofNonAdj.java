public class sumofNonAdj {
    public static void main(String[] args) {
        int[] arr = {5,7,1,0,11,2,1};
        int max=0,index=arr.length,times=2,min=0;
        // while(index>0){
        //     max+=sumOfNonAdj(arr);
        //     index--;
        // }
        // System.out.println(max);
        while(times>0){
            min+=sumOfNonAdj(arr);
            times--;
        }
        System.out.println(min);
        // int incl=0,excl=0;
        // for(int num:arr){
        //     int newExl=Math.max(incl,excl);
        //     incl=excl+num;
        //     excl=newExl;
        // }
        // System.out.println(Math.max(incl, excl));
    }

    private static int sumOfNonAdj(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            // if(max<arr[i]){
            // max=arr[i];
            // index=i;
            // }
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        // if(index==0) arr[index+1]=0;
        // else if(index==arr.length-1) arr[index-1]=0;
        // else{
        //     arr[index-1]=0;
        //     arr[index+1]=0;
        // }
        // arr[index]=0;
        // return max;
        if(index==0) arr[index+1]=Integer.MAX_VALUE;
        else if(index==arr.length-1) arr[index-1]=Integer.MAX_VALUE;
        else{
            arr[index-1]=Integer.MAX_VALUE;
            arr[index+1]=Integer.MAX_VALUE;
        }
        arr[index]=Integer.MAX_VALUE;
        return min;
    }
}
