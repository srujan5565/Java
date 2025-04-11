import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original list:");
        System.out.println(fruits);

        // Use iterator to safely remove "Banana"
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); //  Safe way to remove fruits.remove(fruit);  Unsafe — modifies list during iteration
                                    // Causes ConcurrentModificationException
            }
            // fruits.removeIf(f->f.equals("Banana")); Use this Instead
        }

        System.out.println("\nList after safely removing 'Banana':");
        System.out.println(fruits);
    }
}
