public class pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=i+1;j<=10;j++)
            System.out.print(" ");
            System.out.print(i);
            for(int k=1;k<=i-1;k++)
            System.out.print("  ");
            if(i!=1)
            System.out.print(i);
            System.out.println();
        }
        for(int i=1;i<10;i++)
        {
            for(int j=0;j<i;j++)
            System.out.print(" ");
            System.out.print(10-i);
            for(int k=1;k<=10-i-1;k++)
            System.out.print("  ");
            if(i!=4)
            System.out.print(10-i);
            System.out.println();
        }
    }
}
