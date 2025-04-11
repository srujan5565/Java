class QuickUnionDemo {
    int id[];
    QuickUnionDemo(int N)
    {
        id=new int[N];
        for(int i=0;i<N;i++)
        id[i]=i;
    }
    int root(int i)
    {
        while(i!=id[i])
        i=id[i];
        return i;
    }
    void union(int p,int q)
    {
        p=root(p);
        q=root(q);
        id[p]=q;
    }
    boolean connected(int p,int q)
    {
        return root(p)==root(q);
    }
}
class QuickUnion
{
    public static void main(String args[])
    {
        QuickUnionDemo qf=new QuickUnionDemo(10);
        qf.union(6,5);
        qf.union(2,1);
        qf.union(4,3);
        qf.union(3,8);
        qf.union(9,4);
        qf.union(5,0);
        qf.union(7,2);
        int i=0;
        while(i!=9){
        System.out.println(qf.root(i));
        i++;}
    }
}
