import java.util.ArrayList;

/**
 * main
 */
public class Remove_Invalid_Parentheses {
    public static void main(String[] args) {
        String input ="(v)())()";
        ArrayList<String> result = new ArrayList<>();
        removeInvalid(input,result,0,0,new char[] {'(',')'});
        System.out.println(result);
    }   

    private static void removeInvalid(String input, ArrayList<String> result, int li, int j, char[] cs) {
        //if my string is balanced
        int stack=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==cs[0]){
                stack++;
            }if(input.charAt(i)==cs[1]){
                stack--;
            }
            if(stack>=0){ continue;}
            for(int ji =j;ji<=i;++ji){
              if(input.charAt(ji)==cs[1] && (ji==j || input.charAt(ji-1)!=cs[1])){
                removeInvalid(input.substring(0, ji)
                +input.substring(ji+1)
                , result, i, ji, cs);
              }
            }
            return;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        if(cs[0]=='('){
            removeInvalid(reversed, result, li, j,new char[] {')','('});
        }else{
            result.add(reversed);
        }
    }
}