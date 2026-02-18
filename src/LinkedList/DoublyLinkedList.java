package LinkedList;

/*
    == DOUBLY LINKED LIST ==

    In Singly Linked List:
        Node contains -> data, next

    In Doubly Linked List:
        Node contains -> data, next, prev

    Structure:
        null <- 10 <-> 20 <-> 30 -> null

    Important Points:
    - head.prev is always null
    - tail.next is always null
    - Every insertion/deletion must update BOTH next and prev pointers
    - If you forget to update one pointer → list becomes inconsistent

    Advantages over Singly Linked List:
    - Can traverse forward and backward
    - Delete last node in O(1)
    - Easier deletion when node reference is given

    Time Complexity:
    - Insert at start : O(1)
    - Insert at end   : O(1)
    - Insert at index : O(n)
    - Delete first    : O(1)
    - Delete last     : O(1)
    - Delete index    : O(n)

    Common Mistake:
    Forgetting:
        temp.next.prev = newNode;
    That breaks backward traversal.
*/

public class DoublyLinkedList {

    // Node class
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // -- INSERT --

    // Insert at beginning
    public void insertAtStart(int data) {
        Node node = new Node(data);

        node.next = head;      // new node points to old head
        node.prev = null;      // first node always has prev = null

        if (head != null) {
            head.prev = node;  // old head's prev becomes new node
        }

        head = node;           // move head to new node

        if (tail == null) {    // if list was empty
            tail = node;
        }

        size++;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node node = new Node(data);

        if (tail == null) {    // if list empty
            head = tail = node;
        } else {
            tail.next = node;  // old tail next points to new node
            node.prev = tail;  // new node prev points to old tail
            tail = node;       // move tail
        }

        size++;
    }

    // Insert at specific index
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

        // Move to node just before target index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(data);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;   // connect forward node back to new node
        temp.next = node;

        size++;
    }

    // -- DELETE --

    // Delete first node
    public int deleteFirst() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = head.data;

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;   // list became empty
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

        if (head == tail) {  // only one element
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;

        return value;
    }

    // Delete at index
    public int deleteIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteEnd();
        }

        Node temp = head;

        // Move directly to node to be deleted
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int value = temp.data;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;

        return value;
    }

    // -- UTIL --

    public int size() {
        return size;
    }

    // Display forward
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display backward (extra benefit of DLL)
    public void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}
