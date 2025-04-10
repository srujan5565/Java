import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Book{
    String name;
    int age;
    Book(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+ " Book  (recommended for "+this.age+" year-olds or older)";
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
public class BookComparator {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String s=sc.nextLine();
            if(s.isEmpty()) break;
            System.out.print("Input the age recommendation: ");
            int age=sc.nextInt();
            books.add(new Book(s, age));
            sc.nextLine();
        }
        System.out.println(books.size()+" books in total.\nBooks:");
        books.stream().sorted((a1,a2)->{return a1.age-a2.age;}).forEach(b->System.out.println(b.toString()));
        Comparator<Book> comp=Comparator.comparing(Book::getName).thenComparing(Book::getAge);
        Collections.sort(books,comp);
        books.stream().forEach(b->System.out.println(b.toString()));
    }
}
