package LinkedList;

public class LinkedListBasics {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // --INSERT --

    public void insertAtStart(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }

        size++;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void insert(int data, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        if (index == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    // --DELETE --

    public int deleteFirst() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return value;
    }

    public int deleteEnd() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        if (head == tail) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        int value = tail.data;
        temp.next = null;
        tail = temp;

        size--;

        return value;
    }

    public int deleteIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        int value = temp.next.data;

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;

        size--;

        return value;
    }

    // -- UTIL --

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
