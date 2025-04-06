package Java.OOPsConceptPrograms;
class Counter{
    private int count,init;
    Counter(int count){
        this.count=count;
        this.init=count;
    }
    public void printValue(){
        System.out.println(count);
    }

    public void decrement(){
        count-=1;
    }

    public void reset(){
        this.count=init;
    }
}

class CounterOOPs{
    public static void main(String[] args) {
        Counter counter = new Counter(2);

        counter.printValue();//2

        counter.decrement();
        counter.printValue();//1

        counter.decrement();
        counter.printValue();//0

        counter.decrement();
        counter.printValue();//-1
        counter.reset();
        counter.printValue();//2

        counter.decrement();
        counter.printValue();//1
    }
}