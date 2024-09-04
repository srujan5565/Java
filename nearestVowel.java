public class nearestVowel {
    public static void main(String args[])
    {
        String str="Hello World";
        char chars[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(chars[i]>=65 && chars[i]<=92)
            {
                char c=chars[i];
                if(c>=66 && c<69) chars[i]='e';
                else if(c>=70 && c<73) chars[i]='i';
                else if(c>=74 && c<79) chars[i]='o';
                else if(c>=80 && c<85) chars[i]='u';
                else chars[i]='a';
            }
        }
        for(int i=0;i<str.length();i++)
        {
            System.out.print(chars[i]);
        }
    }
}
