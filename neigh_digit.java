public class neigh_digit {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("44003506681");
        //char chars[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                int newVal = (Character.getNumericValue(str.charAt(i)) * 2);
                str.replace(i, i+2, String.valueOf(newVal));
            }
        }
        System.out.println(str);
    }
}
