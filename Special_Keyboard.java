public class Special_Keyboard {
    public static void main(String[] args) {
        int n=7,count=1;
        if(n<=6)
        System.out.println("Special");
        for(int i=1;i<20;i++)
    System.out.println(i+" "+kcount(i));
}
static int count=3;
public static int kcount(int n){
    n=n-3;
    int count=3,mul=0;
    while(n-3>=0){
        mul++;
        n-=3;
    }
    count=count*mul;

}
}