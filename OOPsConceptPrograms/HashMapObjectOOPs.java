import java.util.HashMap;
import java.util.Objects;

class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getPublished() {
        return published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same object
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return this.published == book.published &&
               this.name.equals(book.name) &&
               this.content.equals(book.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, published, content);
    }

    @Override
    public String toString() {
        return name + " (" + published + ")";
    }
}

public class HashMapObjectOOPs {
    public static void main(String[] args) {
        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");

        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        // Try different lookups
        System.out.println(borrowers.get(bookObject)); // Pekka

        System.out.println(borrowers.get(new Book("Book Object", 2000, "..."))); // Pekka (✅ because equals & hashCode are overridden)

        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "..."))); // Arto (✅ same reason)
    }
}
