class Genericp1<T>
{
    T t;
    Genericp1(T t){
        this.t=t;
    }
    T getValue(){
        return this.t;
    }
    public String toString(){
        return this.t.toString();
    }
}
class Genericp2<T1,T2>
{
    T1 t1;
    T2 t2;
    Genericp2(T1 t1,T2 t2){
        this.t1=t1;
        this.t2=t2;
    }
    public String toString(){
        return this.t1.toString()+" "+ this.t2.toString();
    }
}
public class Generics1 {
    public static void main(String[] args) {
        Genericp1<String> gp1a=new Genericp1<>("String Value");
        Genericp1<Integer> gp1b=new Genericp1(1);
        System.out.println(gp1a);
        System.out.println(gp1b);
        Genericp2<String,String> gp2a = new Genericp2("String value 1", "String value 2");
        Genericp2<String,Integer> gp2b = new Genericp2("String value and ", 1);
        System.out.println(gp2a);
        System.out.println(gp2b);
    }
}
