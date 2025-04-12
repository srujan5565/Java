class Person{
    String name;
    int age;
    Person(String name, int age){
        if(name.length()>40 || name.isEmpty())
        throw new IllegalArgumentException("Name Length should be between 1 and 40");
        if( age<1 || age>120)
        throw new IllegalArgumentException("Age should be between 1 and 120");
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name + " " +this.age;
    }
}
public class ExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("===== Example 1 =====");
        example1();
        System.out.println("=====================");
        System.out.println("===== Example 2 =====");
        example2();
        System.out.println("=====================");
    }
    public static void example1(){
        try{
            System.out.println(1/0);
            System.out.println("--1--");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("--2--");
        }
        System.out.println("--3--");
    }
    public static void example2(){
        try {
            Person p1 = new Person("ds", 40);
            Person p2 = new Person("egew", 0);
            Person p3 = new Person("Maximus Deximus Meridius", 20);
    
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
