import java.util.Scanner;

public class RegExTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // \d - Matches any digit (0-9)
        System.out.print("Enter a digit: ");
        String digit = scanner.nextLine();
        if (digit.matches("\\d")) {
            System.out.println("\\d: It's a digit.");
        } else {
            System.out.println("\\d: Not a digit.");
        }

        // \D - Matches any non-digit
        System.out.print("Enter a non-digit: ");
        String nonDigit = scanner.nextLine();
        if (nonDigit.matches("\\D")) {
            System.out.println("\\D: It's a non-digit.");
        } else {
            System.out.println("\\D: It's a digit.");
        }

        // \w - Matches a word character (letter, digit, or underscore)
        System.out.print("Enter a word character (a-z, A-Z, 0-9, _): ");
        String wordChar = scanner.nextLine();
        if (wordChar.matches("\\w")) {
            System.out.println("\\w: It's a word character.");
        } else {
            System.out.println("\\w: Not a word character.");
        }

        // \W - Matches a non-word character
        System.out.print("Enter a non-word character: ");
        String nonWordChar = scanner.nextLine();
        if (nonWordChar.matches("\\W")) {
            System.out.println("\\W: It's a non-word character.");
        } else {
            System.out.println("\\W: It's a word character.");
        }

        // \s - Matches any whitespace (space, tab, newline)
        System.out.print("Enter a whitespace character (space, tab): ");
        String whitespace = scanner.nextLine();
        if (whitespace.matches("\\s")) {
            System.out.println("\\s: It's a whitespace character.");
        } else {
            System.out.println("\\s: Not a whitespace character.");
        }

        // \S - Matches any non-whitespace character
        System.out.print("Enter a non-whitespace character: ");
        String nonWhitespace = scanner.nextLine();
        if (nonWhitespace.matches("\\S")) {
            System.out.println("\\S: It's a non-whitespace character.");
        } else {
            System.out.println("\\S: It's a whitespace character.");
        }

        // . - Matches any character except newline
        System.out.print("Enter any single character: ");
        String anyChar = scanner.nextLine();
        if (anyChar.matches(".")) {
            System.out.println(". : Valid single character.");
        } else {
            System.out.println(". : Not valid.");
        }

        // ^ and $ - Start and end of the string
        System.out.print("Enter exactly 'hello': ");
        String exactMatch = scanner.nextLine();
        if (exactMatch.matches("^hello$")) {
            System.out.println("^hello$: It's exactly 'hello'.");
        } else {
            System.out.println("^hello$: It's not exactly 'hello'.");
        }

        scanner.close();
    }
}
