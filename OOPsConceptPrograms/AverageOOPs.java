
import java.util.Scanner;

class Average{
    int sum=0,nov=0;
    Scanner sc=new Scanner(System.in);
    public void start(){
        while(true){
            int num = sc.nextInt();
            if(num == 0) break;
            sum +=num;
            nov++;
        }
        System.err.println((float)sum/nov);
    }
}
public class AverageOOPs {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.start();
    }
}
