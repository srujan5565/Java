package Java.OOPsConceptPrograms;

class Account{
 private String acc_String;
 private double money;
 Account(String acc_String, double money){
    this.acc_String=acc_String;
    this.money=money;
 }
 public  void deposit(int deposit){
    money+=deposit;
 }
 public  void withdraw(int withdraw){
money-=withdraw;
 }
 public  double balance(){
    return money;
 }
 public String toString(){
    return acc_String + " " + money; 
 }
}
public class OOPs {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

System.out.println("Initial state");
System.out.println(artosAccount); // equals to System.out.println(artosAccount.toString());
System.out.println(artosSwissAccount);

artosAccount.withdraw(20);
System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
artosSwissAccount.deposit(200);
System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

System.out.println("End state");
System.out.println(artosAccount);
System.out.println(artosSwissAccount);
    }
}


// Dynamic Creation of Objects
// String[] names = {"Alice", "Bob", "Charlie"};
// Map<String, Account> accounts = new HashMap<>();

// for (String name : names) {
//     accounts.put(name, new Account(name + "'s account", 500.0));
// }
