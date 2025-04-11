import java.util.ArrayList;
import java.util.List;

enum Education{
    PHD, MA, BA, HS
}
class Person{
    String name;
    Education education;
    Person(String name,Education education){
        this.name=name;
        this.education=education;
    }
    public Education getEducation(){
        return this.education;
    }
    public String toString(){
        return this.name+ ","+ this.education;
    }
}
class Employees{
 ArrayList<Person> emp;
 Employees(){
    this.emp=new ArrayList<>();
 }
 public void add(Person personToAdd){
    emp.add(personToAdd);
 }
 public void add(List<Person> peopleToAdd){
    for(Person p: peopleToAdd){
        this.emp.add(p);
    }
}
public void print(){
    for(Person p:this.emp){
        System.out.println(p);
    }
}
public void print(Education education){
    for(Person p:this.emp){
        if(p.education == education) System.out.println(p);
    }
}
public void fire(Education education){
    for(Person p:this.emp){
        // if(p.education == education) this.emp.remove(p); //This is dangerous ⚠️ because you're modifying the list (emp) while iterating over it, which will lead to: java.util.ConcurrentModificationException
        
    }
    this.emp.removeIf(p -> p.education == education);
    //Or use Iterator
    /*
      Iterator<Person> iterator = this.emp.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().education == education) {
            iterator.remove(); // Safe removal
        }
    }
     */
}
}
public class EnumExample {
    public static void main(String[] args) {
        // Person anna = new Person("Anna", Education.PHD);
        // System.out.println(anna);

        Employees university = new Employees();
university.add(new Person("Petrus", Education.PHD));
university.add(new Person("Arto", Education.HS));
university.add(new Person("Elina", Education.PHD));

university.print();

university.fire(Education.HS);

System.out.println("==");

university.print();
    }
}
