class Notepad {
    private String name;
    private int year;
 
    public Notepad(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        Notepad compared = (Notepad) object;

        return this.name.equals(compared.name) && this.year == compared.year;
    }
}
public class NotepadOOPS {
    public static void main(String[] args) {
        Notepad basics = new Notepad("Equals basics", 2000);
Notepad advanced = new Notepad("Equals advanced", 2001);

System.out.println(basics.equals(basics));
System.out.println(basics.equals(advanced));
System.out.println(basics.equals(new Notepad("Equals basics", 2000)));
System.out.println(basics.equals(new Notepad("Equals basics", 2001)));
    }
}
