import java.io.*;

class student implements Serializable {
    int id;
    String name;

    student(int sid, String sname) {
        id = sid;
        name = sname;
    }
}

class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("b1.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            student s = (student) in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
