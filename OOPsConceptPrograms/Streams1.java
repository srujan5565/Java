import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Streams1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            if(s.equals("end")) break;
            al.add(s);
        }

        long noOfThreeDivisibles = al.stream().mapToInt(i->Integer.valueOf(i)).filter(i->i%3==0).count();
        double average = al.stream().mapToInt(i->Integer.valueOf(i)).average().getAsDouble();
        System.out.println(noOfThreeDivisibles+" "+average);
        ArrayList<Integer> alnew = al.stream().map(i->Integer.valueOf(i)).filter(i->i%3==0).collect(Collectors.toCollection(ArrayList::new)); //?
        alnew.stream().forEach(value ->System.out.print(value + ","));
        int sum = alnew.stream().reduce(0, (previousSum, value) -> previousSum + value);
        System.out.println("\nsum of values in alsum "+sum);
    }
}
