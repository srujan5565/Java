import java.util.ArrayList;
import java.util.Scanner;
class UserInterface{
    TodoList tdl;
    Scanner scanner;
    UserInterface(TodoList tdl, Scanner scanner){
        this.tdl=tdl;
        this.scanner=scanner;
    }
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Enter Item name: ");
                String task = scanner.nextLine();
                tdl.add(task);
            }
            else if(command.equals("remove")){
                System.out.println("Enter the id to be removed: ");
                int id = scanner.nextInt();
                tdl.remove(id);
            }
            else if(command.equals("list")){
                tdl.print();
            }
            else if(command.equals("stop")){
                continue;
            }

        }
    }
}
class TodoList{
    ArrayList<String> list;
    TodoList(){
        this.list=new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){
        for(int i=0;i<list.size();i++){
            System.out.println(i+1+" "+list.get(i));
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }
}
class ToDoListOOPs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        scanner.close();
    }
}