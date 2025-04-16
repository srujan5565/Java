import java.util.Random;
public class RandomDice {
    public static void main(String[] args) {
        Random dice = new Random();
        System.out.println(1+dice.nextInt(6)); // Because 0 is inclusive and +1 because 6 is exclusive 
    }
}
