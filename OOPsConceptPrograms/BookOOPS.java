import java.util.Objects;

class Book {
    private String title;
    private int year;
    private String description;

    public Book(String title, int year, String description) {
        this.title = title;
        this.year = year;
        this.description = description;
    }

    // Override equals() to check content equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // same reference
        if (obj == null || getClass() != obj.getClass()) return false;  // type check

        Book book = (Book) obj;
        return year == book.year &&
               Objects.equals(title, book.title) &&
               Objects.equals(description, book.description);
    }

    // Optional: Override hashCode() if you override equals
    @Override
    public int hashCode() {
        return Objects.hash(title, year, description);
    }
}

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
