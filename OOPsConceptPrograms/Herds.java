import java.util.ArrayList;

interface Movable{
void move(int dx, int dy);
}
class Organism implements Movable{
    int x,y;
    public Organism(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void move(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    public String toString(){
        return "x: "+ this.x+" ; y: "+this.y;
    }
}
class Animal implements Movable{
    int x,y;
    public Animal(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void move(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    public String toString(){
        return "x: "+ this.x+" ; y: "+this.y;
    }
}
class Herd implements Movable{
    ArrayList<Movable> herd;
    Herd(){
        herd= new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable h:herd){
            h.move(dx, dy);
        }
    }
    public String toString(){
        String s="";
        for(Movable h:herd){
            s+=h.toString()+"\n";
        }
        return s;
    }
}
class Herds{
    public static void main(String args[]){
        // Organism organism = new Organism(20, 30);
        // System.out.println(organism);
        // organism.move(-10, 5);
        // System.out.println(organism);
        // organism.move(50, 20);
        // System.out.println(organism);

        Herd herd = new Herd();
herd.addToHerd(new Organism(57, 66));
herd.addToHerd(new Organism(73, 56));
herd.addToHerd(new Animal(3, 56));
herd.addToHerd(new Organism(73, 56));
herd.addToHerd(new Animal(46, 2));
herd.addToHerd(new Organism(19, 107));
System.out.println(herd);
    }
}