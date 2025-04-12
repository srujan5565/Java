import java.util.ArrayList;
import java.util.List;

class Statistics {
    private List<Integer> numbers;

    public Statistics() {
        this.numbers = new ArrayList<>(); // initialize the list to fix the NullPointerException
    }

    public void add(int number) {
        this.numbers.add(number);
    }

    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}

public class printStackTraceEx {
    public static void main(String[] args) {
        try {
            Statistics st = new Statistics();
            System.out.println("Printing the average of the statistics: " + st.average());
            System.out.println("Adding number 22");
            st.add(22);
            System.out.println("Printing the average of the statistics: " + st.average());
        } catch (Exception e) {
            e.printStackTrace(); // this is the key line!
        }
    }
}
