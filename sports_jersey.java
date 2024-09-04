public class sports_jersey {
    public static void main(String[] args) {
        int k=0,count=1;
        int arr[]={1,2,3,4,5};
        int index[]={2,3,1,5,4};
        int newarr[]=new int[5];
        while(newarr[0]!=index[0] || newarr[1]!=index[1]|| newarr[2]!=index[2] || newarr[3]!=index[3] ){
            for(int i:index){newarr[i-1]=arr[k++];}
            for(int i=0;i<5;i++){
                arr[i]=newarr[i];
                System.out.print(newarr[i]);}
            System.out.println("");
            k=0;
            count++;
        }
        System.out.println(count);
        
    }
}
