import java.util.ArrayList;

class Person{
    String name,address;
    Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return name + "\n  " +address;
    }
}
class Student extends Person{
    int credits;
    Student(String name, String address){
        super(name, address);
        this.credits=0;
    }
    public void study(){
        this.credits+=1;
    }
    public int credits(){
        return this.credits;
    }
    @Override
    public String toString(){
        return name + "\n  " +address + " \n  "+ "Study credits " + this.credits;
    }
}
class Teacher extends Person{
    int salary;
    Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }
    @Override // Why ?? -goto line ~85
    public String toString(){
        return name + "\n  " +address + " \n  "+ "salary " +salary+ " euro/month ";
    }
}
public class PersonStudentTeacher {
   public static void main(String[] args) {
//     Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
// Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
// System.out.println(ada);
// System.out.println(esko);


// Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
// System.out.println(ollie);
// ollie.study();
// System.out.println(ollie);

// Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
// Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
// System.out.println(ada);
// System.out.println(esko);

// Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

// int i = 0;
// while (i < 25) {
//   ollie.study();
//   i = i + 1;
// }
// System.out.println(ollie);

// ArrayList<Person> persons = new ArrayList<Person>();
//     persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//     persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

//     printPersons(persons);

//Dynamic Method dispatch
// Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
// System.out.println(ollie);
// Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
// System.out.println(olliePerson);
// Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
// System.out.println(ollieObject);

// Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
// System.out.println(alice);

   }


   public static void printPersons(ArrayList<Person> persons){
    for(Person p: persons){
        System.out.println(p);
    }
   }
}





/*
 1. Catches errors at compile time
If you think you're overriding a method, but actually you're not (because of a typo or incorrect method signature), the compiler will give you an error.

🔻 Without @Override:

public String tostring() {  // typo: should be toString()
    return "oops";
}
This won’t override anything. Java will just treat it as a new method — and your toString() won’t be called as expected.

✅ With @Override, Java will catch that mistake:

@Override
public String tostring() {
    return "oops"; // Compiler error: method does not override or implement a method from a supertype
}
 */