import java.util.*;
public class supermarketprice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k,pro=1;
        while(n!=0)
        {
            k=n%10;
            pro*=k;
            n=n/10;
        }
        System.out.println("Product = "+pro);
    }  
}
