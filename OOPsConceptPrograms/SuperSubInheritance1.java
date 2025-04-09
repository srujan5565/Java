// Superclass.java
class Superclass {

    private String objectVariable;

    public Superclass() {
        this("Example"); // constructor chaining
        System.out.println("Superclass no-arg constructor");
    }

    public Superclass(String value) {
        System.out.println("Superclass(String) constructor");
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }
}
class Subclass extends Superclass {

    public Subclass() {
        super("Subclass");
        System.out.println("Subclass constructor");
    }
}
public class SuperSubInheritance1 {
    public static void main(String[] args) {
         Superclass sup = new Superclass();
        System.out.println("Superclass object says: " + sup);

        Subclass sub = new Subclass();
        System.out.println("Subclass object says: " + sub);
    }
}
