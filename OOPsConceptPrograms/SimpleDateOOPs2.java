import java.util.Objects;

class SimpleDate{
    int date,month,year;
    SimpleDate(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    @Override
    public boolean equals(Object object){
        if (!(object  instanceof SimpleDate)) return false;
        if(this == object) return true;
        SimpleDate anotherDate =(SimpleDate) object;
        return this.date==anotherDate.date && this.month==anotherDate.month && this.year==anotherDate.year;
    }
    public int hashCode(){
        return Objects.hash(date,month,year);
    }
}
public class SimpleDateOOPs2 {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
System.out.println(d.equals("heh"));
System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
