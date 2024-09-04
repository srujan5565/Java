public class perm {
    public static void main(String args[])
    {
        //Cache technique
        String str=new String("dog");
        permute(str,"");
    }
    public static void permute(String str,String res)
    {
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char remember=str.charAt(i);
            String substr=str.substring(0, i)+str.substring(i+1);
            permute(substr,res+remember);
        }
    }
}
