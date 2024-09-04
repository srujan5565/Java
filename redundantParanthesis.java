import java.util.Stack;

public class redundantParanthesis {
    public static void main(String[] args) {
        String s="((a+b))";
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                int count=0;
                while(stack.peek()!='(')
                {
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count<2){System.out.println(true);
                System.exit(1);
                }
            }
            else
            stack.push(ch);
        }
        System.out.println(false);
    }
}
