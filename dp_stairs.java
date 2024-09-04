public class dp_stairs {
    public static void main(String[] args) {
        int n=4;
        System.out.println(findSteps(n));
        
    }
    public static int findSteps(int n){
        int stair[]=new int[n+1];
        stair[1]=1;
        stair[2]=2;
        for(int i=3;i<=n;i++)
        stair[i]=stair[i-1]+stair[i-2];
        return stair[n];
    }
    }

