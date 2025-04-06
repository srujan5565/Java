public class Calculator {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void add(int number) {
        value += number;
    }

    public void subtract(int number) {
        value -= number;
    }
}
