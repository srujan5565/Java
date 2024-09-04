import java.util.Scanner;

class Student{
    String name;
    int age;
    int marks[]=new int[5];
    long roll;
}

class class_ex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Student s[]=new Student[num]; // Array of Objects
        for(int i=0;i<num;i++)
        s[i]=new Student();//Memory allocation to the objects
        // for(int i=0;i<num;i++)
        // Student s[i]=new Student();
        Student s1=new Student();
        s1.name="qwert";
        s1.age=21;
        s1.roll=214423;
        int arr[]={34,45,3,23,54};
        s1.marks=arr;
        System.out.println(s1);
    }
}