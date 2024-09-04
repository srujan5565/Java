import java.util.Stack;

public class nxtsmall_nxtgrt 
{    public static void main(String[] args){ 
        int arr[]={5,1,9,2,1,7};
        int grt[]=new int[7];
        Stack<Integer> st1=new Stack<>();
        grt[arr.length-1]=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
           if(!st1.isEmpty()&& st1.peek() > arr[i]){
            grt[i]=st1.peek();
           }
           else if(st1.isEmpty()){
           st1.push(i);
           }
            else{
            st1.pop();
            grt[i]=-1;
            st1.push(i);
            }
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(grt[i]+" ");
System.out.println();
        Stack<Integer> st2=new Stack<>();

        int sml[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
           if(!st2.isEmpty()&& st2.peek() > arr[grt[i]]){
            sml[i]=st2.peek();
           }
           else if(st2.isEmpty()){
           st2.push(arr[grt[i]]);
           }
            else{
            st2.pop();
            sml[i]=-1;
            st2.push(arr[grt[i]]);
            }
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(sml[i]+" ");

    }
    }