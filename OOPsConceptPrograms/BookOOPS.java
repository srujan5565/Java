public class BookOOPS {
    public static void main(String[] args) {
        Book bookObject = new Book("Book object", 2000, "...");
Book anotherBookObject = bookObject;

if (bookObject.equals(anotherBookObject)) {
    System.out.println("The books are the same");
} else {
    System.out.println("The books aren't the same");
}

// we now create an object with the same content that's nonetheless its own object
anotherBookObject = new Book("Book object", 2000, "...");

if (bookObject.equals(anotherBookObject)) {
    System.out.println("The books are the same");
} else {
    System.out.println("The books aren't the same");
}
    }
}
