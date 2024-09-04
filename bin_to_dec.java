public class bin_to_dec {
    public static void main(String[] args) {
        String Bin="10101011";
        int dec=0;
        // int val=Integer.parseInt(Bin,2);
        // System.out.println(val);
        for(int i=0;i<Bin.length();i++)
        {
            if(Bin.charAt(i)=='1')
            dec+=Math.pow(2, Bin.length()-1-i);
        }
        System.out.println(dec);
    }
}
