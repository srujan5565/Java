import java.util.ArrayList;

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }
}
public class StreamOOPs {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("Alice", "Johnson", 1985));
        list.add(new Person("Bob", "Smith", 1992));
        list.add(new Person("Charlie", "Brown", 1975));
        list.add(new Person("Ava", "Taylor", 1989));
        list.add(new Person("David", "Wilson", 1995));
        list.add(new Person("Alice", "Thompson", 2000));
        list.add(new Person("Andrew", "White", 1980));
        list.add(new Person("Eve", "Davis", 1999));


        //Print the number of persons born before the year 1990.
        long count = list.stream().filter(p->p.getBirthYear()<1990).count();
        System.out.println(count);


        //How many persons' first names start with the letter "A"
        long count2 = list.stream().filter(p->p.getFirstName().startsWith("a")).count();
        System.out.println(count2);

        //Print the number of unique first names in alphabetical order
        list.stream().map(p->p.getFirstName()).distinct().sorted().forEach(p->System.out.print(p+" "));
    }
}
