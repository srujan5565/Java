class QuickFind{
    int id[];
    QuickFind(int N)
    {
        id=new int[N];
        for(int i=0;i<N;i++)
        id[i]=i;
    }
    boolean connected(int p,int q)
    {
        return id[p]==id[q];
    }
    void union(int p,int q)
    {
        int pid=id[p],qid=id[q];
        for(int i=0;i<id.length;i++)
        if(pid==id[i])
        id[i]=qid;
    }
}
class UnionFind
{
    public static void main(String args[])
    {
        QuickFind qf=new QuickFind(10);
        qf.union(1,2);
        System.out.println(qf.connected(1,2));
        System.out.println(qf.connected(3,2));

    }
}