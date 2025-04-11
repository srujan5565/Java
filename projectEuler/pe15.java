//pending
public class pe15 {
    public static void main(String[] args) {
    move(0);
        
    }
    static int i=0,j=0,num=0;
     public static int move(int num)
        {
            while(i<19 && j<19)
            {
                int i=move(num);
                int j=move(num);
                num++;
            }
            return num;
        }
    
    
}
