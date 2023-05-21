package edu.kis.vh.nursery.list;

// TODO: klasa IntLinkedList i niektóre z jej metod nie są nigdy używane
public class IntLinkedList {

    private static final int DEFAULT = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: isFull() nie powinna zawsze zwracać false
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}