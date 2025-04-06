
import java.util.ArrayList;
import java.util.Scanner;

public class Lastinlist {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String name;
        while(true){
            name=sc.nextLine();
            if(name.isEmpty()){
                printLastName(nameList);
                System.out.println(nameList);
                return;
            }
            else nameList.add(name);
        }
    }

    public static void printLastName(ArrayList<String> nameList) {
        // System.out.println(nameList.get(nameList.size()-1));
        System.out.println(nameList);
        nameList.remove(2);
    }
    
}
