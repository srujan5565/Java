abstract class Shape{
    abstract int area();
    abstract int per();
}
class Rec extends Shape
{
    int a,b;
    Rec(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int area()
    {
        return a*b;
    }
    int per()
    {
        return 2*(a+b);
    }
}
class Squ extends Shape
{
    int a;
    Squ(int a)
    {
        this.a=a;
    }
    int area()
    {
        return a*a;
    }
    int per()
    {
        return a*4;
    }
}
class gcd
{
    public static void main(String[] args) {
        Rec r=new Rec(2,2);
        Squ s=new Squ(2);
        System.out.println(r.area());
        System.out.println(r.per());
        System.out.println(s.area());
        System.out.println(s.per());

    }
}