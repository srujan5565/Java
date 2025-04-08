import java.util.ArrayList;
import java.util.HashMap;

class StorageFacility{
    String unit,item;
    HashMap<String,ArrayList<String>> unititems;
    StorageFacility(){
        this.unititems=new HashMap<>();
    }
    public void add(String unit, String item){
        this.unititems.putIfAbsent(unit, new ArrayList<>());
        this.unititems.get(unit).add(item);
    }
    public void remove(String storageUnit, String item){
        this.unititems.get(storageUnit).remove(item);
        if (unititems.get(storageUnit).isEmpty()) {
            unititems.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> units =new ArrayList<>();
        for(String s:unititems.keySet()){
            units.add(s);
        }
        return units;
    }
    public ArrayList<String> contents(String storageUnit){
        return this.unititems.get(storageUnit);
    }
}
class StorageFacilityOOPs{
    public static void main(String[] args) {
//         StorageFacility facility = new StorageFacility();
// facility.add("a14", "ice skates");
// facility.add("a14", "ice hockey stick");
// facility.add("a14", "ice skates");

// facility.add("f156", "rollerblades");
// facility.add("f156", "rollerblades");

// facility.add("g63", "six");
// facility.add("g63", "pi");

// System.out.println(facility.contents("a14"));
// System.out.println(facility.contents("f156"));
StorageFacility facility = new StorageFacility();
facility.add("a14", "ice skates");
facility.add("a14", "ice hockey stick");
facility.add("a14", "ice skates");

facility.add("f156", "rollerblades");
facility.add("f156", "rollerblades");

facility.add("g63", "six");
facility.add("g63", "pi");

facility.remove("f156", "rollerblades");

System.out.println(facility.contents("f156"));

facility.remove("f156", "rollerblades");

System.out.println(facility.storageUnits());
    }
}