class UserDE
{
    static void display()
        {
            try{
                throw new ArithmeticException("Zero");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Caught :"+e);
                throw e;
            }
        }
    public static void main(String args[]) {
        try{
            display();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Recaught :"+e);
        }
    }
}