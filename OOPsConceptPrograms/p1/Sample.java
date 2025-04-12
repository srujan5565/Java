package p1;
public class Sample{
    public void display(){
        System.out.println("Welcome to packages");
    }
}
class packageSampleDemo {
    public static void main(String[] args) {
        Sample s=new Sample();
        s.display();
    }
}
