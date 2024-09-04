public class strrev_2pointer {
    public static void main(String args[])
    {
        String str="Rajesham";
        char chars[]=str.toCharArray();
        int first=0,last=str.length()-1;
        while(first<last)
        {
            char temp=chars[first];
            chars[first]=chars[last];
            chars[last]=temp;
            first++;
            last--;
        }
        String mod_str=new String(chars);
        System.out.println(mod_str);
    }
}
