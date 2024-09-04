import java.util.Stack;

public class stack_sorting {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int arr[]={876235,7,56,23,7,76,7,345,7};
        int temp=0;
        for(int i=0;i<arr.length;i++){stack.push(arr[i]);}
        Stack<Integer> tempstack=new Stack<>();
        tempstack.push(stack.pop());
        while(!stack.isEmpty()){
            while(!stack.isEmpty() && tempstack.peek()<stack.peek()){
                tempstack.push(stack.pop());
            }
            if(stack.isEmpty()) break;
            if(!stack.isEmpty())
            temp=stack.pop();
            while(!tempstack.isEmpty() && tempstack.peek()>temp){
                stack.push(tempstack.pop());
            }
            tempstack.push(temp);
            System.out.println();
        }
        System.out.print(tempstack);
    }
}
