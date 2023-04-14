package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = -1;
    public static final int MAX_SIZE = 12;

    private int[] numbers = new int[MAX_SIZE];
    public int total = SIZE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    public boolean callCheck() {
        return total == SIZE;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return SIZE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return SIZE;
        return numbers[total--];
    }

}
