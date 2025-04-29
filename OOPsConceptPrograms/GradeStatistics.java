import java.util.Arrays;
import java.util.Scanner;
class Average{
    int sum=0,nov=0,pass_sum=0,nop=0;
    int grade[] =new int[6];
    Scanner sc=new Scanner(System.in);
    void start(){
        Arrays.fill(grade,0);
        System.out.println("Enter point totals, -1 stops ");
        while(true){
            int num = sc.nextInt();
            if(num == -1) break;
            if(num<1 || num>99) continue;
            if(num>50){
                pass_sum+=num;
                nop++;
            }
            sum +=num;
            nov++;
            grade[gradeCalc(num)]++;
        }
        System.out.println("Point average (all): "+(float)sum/nov);
        try {
            System.out.println("Point average (Passing): "+(float)pass_sum/nop);
        } catch (Exception e) {
            System.out.println("Point average (Passing): -"); // Division by Zero for floats in java doesn't throw exception. for div by 0 it returns NaN
        }
        System.out.println("Pass Percentage: "+ 100*(float)nop/nov);
        if(grade.length>0) gradeDist(grade);
    }  
    int gradeCalc(int num){
        if(num<50) return 0;
        else if(num<60) return 1;
        else if(num<70) return 2;
        else if(num<80) return 3;
        else if(num<90) return 4;
        else return 5;
    }
    void gradeDist(int[] grade){
        for(int i=5;i>-1;i--){
            System.out.print(i+":");
            for(int j=0;j<grade[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class GradeStatistics {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.start();
        System.out.println();
    }
}
