public class stringex1 {
    public static void main(String[] args) {
        String box="101001001001";
        char chars[]=box.toCharArray();
        char chars2[]=new char[box.length()];
        int left=0,right=box.length()-1;
        for(int i=0;i<box.length();i++)
        {
            
            if(chars[i]=='0')
            chars2[left++]=chars[i];
            else
            chars2[right--]=chars[i];
        }
        String box2=new String(chars2);
        System.out.println(box2);
    }
}
