import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1;
        n1=sc.nextInt();
        float f1;
        f1=sc.nextFloat();
        sc.nextLine();//Before taking the value of string
        String s1;
        s1=sc.nextLine();
        char ch1;
        ch1=sc.next().charAt(0);
        System.out.println(n1 +" "+f1+" "+s1+" "+ch1);
    }
}
