import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Student number format validation
        System.out.print("Enter student number (format 01XXXXXXX): ");
        String studentNumber = scanner.nextLine();
        if (studentNumber.matches("01[0-9]{7}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }

        // Example 2: Alternation (|)
        String altString = "00";
        if (altString.matches("00|111|0000")) {
            System.out.println("Alternation: The string contained one of the three alternatives.");
        } else {
            System.out.println("Alternation: The string contained none of the three alternatives.");
        }

        // Example 3: Grouping with parentheses
        String groupString = "00001";
        if (groupString.matches("0000(0|1)")) {
            System.out.println("Grouping: String matches 00000 or 00001.");
        } else {
            System.out.println("Grouping: String does not match.");
        }

        // Example 4: Quantifier (*)
        String starString = "trolololololo";
        if (starString.matches("trolo(lo)*")) {
            System.out.println("Quantifier *: Correct form.");
        } else {
            System.out.println("Quantifier *: Incorrect form.");
        }

        // Example 5: Quantifier (+)
        String plusString = "trolololololo";
        if (plusString.matches("tro(lo)+")) {
            System.out.println("Quantifier +: Correct form.");
        } else {
            System.out.println("Quantifier +: Incorrect form.");
        }

        // Example 6: Quantifier (?)
        String optionalString = "You have to accidentally the whole meme";
        if (optionalString.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Quantifier ?: Correct form.");
        } else {
            System.out.println("Quantifier ?: Incorrect form.");
        }

        // Example 7: Quantifier {a}
        String exactRepeat = "1010";
        if (exactRepeat.matches("(10){2}")) {
            System.out.println("Quantifier {2}: Correct form.");
        } else {
            System.out.println("Quantifier {2}: Incorrect form.");
        }

        // Example 8: Quantifier {a,b}
        String rangeRepeat = "1";
        if (rangeRepeat.matches("1{2,4}")) {
            System.out.println("Quantifier {2,4}: Correct form.");
        } else {
            System.out.println("Quantifier {2,4}: Incorrect form.");
        }

        // Example 9: Quantifier {a,}
        String minRepeat = "11111";
        if (minRepeat.matches("1{2,}")) {
            System.out.println("Quantifier {2,}: Correct form.");
        } else {
            System.out.println("Quantifier {2,}: Incorrect form.");
        }

        // Example 10: Multiple quantifiers
        String complexString = "5551010111555";
        if (complexString.matches("5{3}(1|0)*5{3}")) {
            System.out.println("Multiple quantifiers: Correct form.");
        } else {
            System.out.println("Multiple quantifiers: Incorrect form.");
        }

        // Example 11: Character classes
        String charClassString = "abcab";
        if (charClassString.matches("[a-c]*")) {
            System.out.println("Character Class: Correct form.");
        } else {
            System.out.println("Character Class: Incorrect form.");
        }

        scanner.close();
    }
}
