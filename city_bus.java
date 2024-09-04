public class city_bus {
    static String bs[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
    static int path[]={800,600,750,900,1400,1200,1100,1500};
    public static void main(String args[])
    {
        String so=new String("NI");
        String de=new String("HA");
        System.out.println(getFare(so,de));
    }
    public static int getFare(String s,String d)
    {
        int so=0,de=0,dist=0;
        for(int i=0;i<bs.length;i++)
        {
            if(bs[i].equals(s))
            so=i;
            if(bs[i].equals(d))
            de=i;
        }
        while(so!=de)
        {
            if(so>bs.length-1)
            so=0;
            dist+=path[so];
            so++;
        }
        //Another method : 
        // if(de<so)
        // {
        //     while(so<=bs.length-1)
        // {
        //     dist+=path[so];
        //     System.out.println(path[so]);
        //     so++;
        // }
        //     int k=0;
        //     while(k<de)
        //     {
        //         dist+=path[k];
        //         System.out.println(path[k]);
        //     k++;
        //     }
        // }
        return dist;
    }
}
