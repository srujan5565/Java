public class Exceptn_hndlng {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Occurs at any case");
        }
        System.out.println("Program flow continues .. ");
    }
}
