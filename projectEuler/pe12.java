class pe12
{
        public static void main(String[] args) {
        int i,j,div=0;
        int tnum[]=new int[100000];
        for ( i = 0; i < tnum.length; i++) {
        tnum[i] = 0;
        }
        i=1;
        while(div<=500)
        {
            for(j=1;j<=i;j++)
            {
                tnum[i]+=j;
            }
            div=divisor(tnum[i]);
            if(div>100)
            System.out.println(tnum[i] +" "+div);
            i++;
        }
    }
    public static int divisor(int num)
    {
        int count=0,i=1;
        while(i <= num/2)
        {
            if(num%i==0)
            count++;
            i++;
        }
        return count;
    }
}