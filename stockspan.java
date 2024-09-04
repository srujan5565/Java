import java.util.Stack;

public class stockspan {
    public static void main(String[] args) {
     int arr[]={13,15,12,14,16,8,6,4,10,30}  ;
     Stack<Integer> s=new Stack<>();
     /*for(int i=arr.length-1;i>0;i--){
        int count=1;
        for(int j=i;j>0;j--){
            if(arr[j-1]<arr[i])
            count++;
            else{
                break;
            }
        }System.out.print(count+" ");
        count=1;
     }*/
     //Ans : 10 4 1 1 1 5 2 1 2 (last one will be always 1 which is not printed )
     //Can be solved using two pointer method 

     //Using Stack
     int span[]=new int[10];
     span[0]=1;
     s.push(0);
     for(int i=1;i<arr.length;i++){
    while(!s.isEmpty() && arr[s.peek()]<arr[i])
    s.pop();
    span[i]=s.isEmpty()? (i+1) :(i-s.peek());
    s.push(i);
     }
     for(int i=0;i<10;i++)
     System.out.print(span[i]+" ");
    }
}
