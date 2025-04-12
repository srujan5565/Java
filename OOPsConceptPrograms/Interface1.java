import java.util.ArrayList;

interface Packable {
    double weight();
}
class Box implements Packable{
    ArrayList<Packable> list;
    double max;
    Box(double max){
        this.list=new ArrayList<>();
        this.max=max;
    }
    public void add(Packable item) {
        if (this.weight() + item.weight() <= max) {
            list.add(item);
        }
    }
    public double weight() {
        double weight=0;
        for(Packable i:list){
            weight+=i.weight();
        }
        return weight;
    }
    public String toString(){
        return "Box: "+ list.size() +" items, total weight "+ this.weight() +" kg";
    }
}
class Book implements Packable{
    String name,author;
    double weight;
Book(String author,String name,double weight){
    this.author=author;
    this.name=name;
    this.weight=weight;
}
public Book(String author2, int i, String string) {
    //TODO Auto-generated constructor stub
}
public double weight(){
    return this.weight;
}
public String toString(){
    return author + " : "+name;
}
}
class CD implements Packable{
    String name,author;
    double weight=0.1;
    int year;
CD(String author,String name,int year){
    this.author=author;
    this.name=name;
    this.year=year;
}
public double weight(){
    return 0.1;
}
public String toString(){
    return author + " : "+name + " ( "+year+" )";
}
}
public class Interface1 {
    public static void main(String[] args) {
    //     Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    // Book book2 = new Book("Robert Martin", "Clean Code", 1);
    // Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
    // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
    // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

    // System.out.println(book1);
    // System.out.println(book2);
    // System.out.println(book3);
    // System.out.println(cd1);
    // System.out.println(cd2);
    // System.out.println(cd3);

    Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
