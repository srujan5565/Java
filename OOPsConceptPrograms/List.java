public class List<Type>
{
    Type[] values;
    int index;
    public List() {
        this.values = (Type[]) new Object[10];
        this.index = 0;
    }
    public void add(Type parameter){
        if(this.index == this.values.length) {
            grow();
        }
        this.values[index]=parameter;
        this.index++;
    }
    private int indexOfValue(Type value) {
        for (int i = 0; i < this.index; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.index - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }
    
        moveToTheLeft(indexOfValue);
        this.index--;
    }
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    public Type value(int index) {
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.index + "]");
        }
    
        return this.values[index];
    }
    public int size(){
        return this.index;
    }
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
    
        //The automatic Java garbage collector removes the old array at some point, now that there are no longer any references to it.
        this.values = newValues;
    }
    public String toString(){
        String s="";
        for(Type t:values){
            s+=t.toString()+" ";
        }
        return s;
    }
}