import java.io.*;
class student implements Serializable
{
    int id;
    String name;
    student(int sid,String sname)
    {
        id=sid;
        name=sname;
    }
}
class Serialization
{
    public static void main(String[] args) throws IOException
    {
        student s1=new student(101, "nani");
        FileOutputStream fos=new FileOutputStream("b1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        fos.close();



    }
}