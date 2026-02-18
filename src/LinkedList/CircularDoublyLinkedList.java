package LinkedList;

/*
    ============ CIRCULAR DOUBLY LINKED LIST ============

    Combines:
    - Doubly Linked List (next + prev)
    - Circular Linked List (no null at ends)

    Structure:
        head.prev = tail
        tail.next = head

    Example:
        10 <-> 20 <-> 30
         ^              |
         |______________|

    Important:
    - No node has null in next or prev (unless list empty)
    - Traversal stops when temp == head again
    - Must carefully update 4 links during insertion/deletion

    Time Complexity:
    - Insert at start : O(1)
    - Insert at end   : O(1)
    - Insert at index : O(n)
    - Delete first    : O(1)
    - Delete last     : O(1)
    - Delete index    : O(n)
*/

public class CircularDoublyLinkedList {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // ---------------- INSERT ----------------

    // Insert at beginning
    public void insertAtStart(int data) {

        Node node = new Node(data);

        if (head == null) {          // empty list
            head = tail = node;
            node.next = node;
            node.prev = node;
        } else {
            node.next = head;
            node.prev = tail;

            head.prev = node;
            tail.next = node;

            head = node;
        }

        size++;
    }

    // Insert at end
    public void insertAtEnd(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            node.next = node;
            node.prev = node;
        } else {
            node.prev = tail;
            node.next = head;

            tail.next = node;
            head.prev = node;

            tail = node;
        }

        size++;
    }

    // Insert at index
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
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    // ---------------- DELETE ----------------

    // Delete first node
    public int deleteFirst() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = head.data;

        if (head == tail) {      // only one element
            head = tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

        size--;

        return value;
    }

    // Delete last node
    public int deleteEnd() {

        if (tail == null) {
            throw new RuntimeException("List is empty");
        }

        int value = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

        size--;

        return value;
    }

    // Delete at index
    public int deleteIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteEnd();

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int value = temp.data;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;

        return value;
    }

    // ---------------- UTIL ----------------

    public int size() {
        return size;
    }

    // Display forward
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Display backward
    public void displayReverse() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println("(back to tail)");
    }
}
