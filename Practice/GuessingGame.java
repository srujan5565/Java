import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random num=new Random();
        Scanner sc=new Scanner(System.in);
        int number = num.nextInt(100)+1;
        int chances=5;
        int guessedNumber;
        while(chances!=0){
            System.out.print("Guess the number: ");
            guessedNumber=sc.nextInt();
            if(guessedNumber<number) System.out.println("Too Low");
            else if(guessedNumber>number) System.out.println("Too High");
            else{
                System.out.println("Correct");
                return;
            }
            chances--;
        }
        System.out.println("Chances Completed. Better Luck Next Time");
    }
}
