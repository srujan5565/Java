import java.util.Stack;

public class paranthesis_stack {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String st=new String("{}[]()");
        // String st=new String("{}[]()");
        // String st=new String("{}[]()");
        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                s.push(c);
            }
            else{
                char check=(char)s.peek();
                if(c==')' && check=='(' || c=='}' && check=='{' || c==']' && check=='[')
                s.pop();
                else{
                    System.out.println("Not valid");
                    return;
                }

            }
        }
        if(s.isEmpty())
        System.out.println("Valid");
        else System.out.println("Not valid");
    }
}
