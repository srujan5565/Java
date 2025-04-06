import java.util.ArrayList;

class Item{
    String name;
    int weight;
 Item(String name,int weight){
    this.name=name;
    this.weight=weight;
 }
 public String getName(){
    return name;
 }
 public int getWeight(){
    return weight;
 }
 public String toString(){
    return name +" ( "+weight+" kg ) ";
 }
}

class Suitcase{
    int maxWeight,currWeight=0,compareWeight=0;
    ArrayList<Item> list = new ArrayList<>();
    Suitcase(int maxWeight){
        this.maxWeight=maxWeight;
    }
    public void addItem(Item item){
        list.add(item);
        currWeight+=item.getWeight();
    }
    public String toString(){
        return list.size()+" items "+"("+currWeight+" kg)";
    }
    public Item heaviestItem(){
        Item heaviestWeightItem=new Item("sample",0);
        for(Item i:list){
            if(i.getWeight()>heaviestWeightItem.getWeight()){
                heaviestWeightItem=i;
            }
        }
        return heaviestWeightItem;
    }
}

class Hold{
    int maxWeight,noOfSuitcases=0,weight=0;
    ArrayList<Suitcase> hold = new ArrayList<>();
    Hold(int maxWeight){
        this.maxWeight=maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        hold.add(suitcase);
        weight+=suitcase.currWeight;
        noOfSuitcases++;
    }

    public String toString(){
        return noOfSuitcases +"suitcases"+ "("+weight +"kg)";
    }
}
public class CargoOOPs {
    public static void main(String[] args) {

        // Item book = new Item("The lord of the rings", 2);
        // Item phone = new Item("Nokia 3210", 1);

        // System.out.println("The book's name: " + book.getName());
        // System.out.println("The book's weight: " + book.getWeight());

        // System.out.println("Book: " + book);
        // System.out.println("Phone: " + phone);

        // Item book = new Item("Lord of the rings", 2);
        // Item phone = new Item("Nokia 3210", 1);
        // Item brick = new Item("brick", 4);

        // Suitcase suitcase = new Suitcase(5);
        // System.out.println(suitcase);

        // suitcase.addItem(book);
        // System.out.println(suitcase);

        // suitcase.addItem(phone);
        // System.out.println(suitcase);

        // suitcase.addItem(brick);
        // System.out.println(suitcase);


        // Item book = new Item("Lord of the rings", 2);
        // Item phone = new Item("Nokia 3210", 1);
        // Item brick = new Item("Brick", 4);

        // Suitcase suitcase = new Suitcase(10);
        // suitcase.addItem(book);
        // suitcase.addItem(phone);
        // suitcase.addItem(brick);

        // Item heaviest = suitcase.heaviestItem();
        // System.out.println("Heaviest item: " + heaviest);

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
    }
}
