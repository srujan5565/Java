class pe14
{
    public static void main(String[] args) {
        int count[]=new int[1000001];
        int num[]=new int[1000];
        int max=0,n=0;
        for(int i=1;i<1000000;i++)
        {
            //System.out.println(i);
            count[i]=0;
            long k=i;
            while(k!=1)
            {
                if(k%2==0)
                {
                    k=k/2;
                    count[i]++;
                }
                else{
                    k=3*k+1;
                    count[i]++;
                }
            }
            if(max<count[i])
            {max=count[i];
            num[n]=i;
            
            n++;
            }
        }
        
        System.out.println(num[n-1]);
    }
}