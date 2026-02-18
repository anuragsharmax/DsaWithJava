package LinkedList;

/*
    == CIRCULAR SINGLY LINKED LIST ==

    1) In normal Singly Linked List:
       Last node -> null

    2) In Circular Linked List:
       Last node -> head
       (No node points to null)

    Example:
        10 -> 20 -> 30
        ^              |
        |______________|

    Important Points:
    - tail.next must always point to head
    - Traversal cannot use while(temp != null)
    - Use do-while loop or stop when temp == head
    - Be careful to maintain circular link after every insertion/deletion

    Time Complexity:
    - Insert at start : O(1)
    - Insert at end   : O(1)
    - Insert at index : O(n)
    - Delete first    : O(1)
    - Delete last     : O(n)
    - Delete index    : O(n)

    Real Life Uses:
    - Round Robin Scheduling
    - Multiplayer Turn Games
    - Circular Buffer
*/

public class CircularLinkedList {

    private class Node {
        int data;
        Node next;

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

        if (head == null) {      // if list empty
            head = tail = node;
            node.next = head;    // circular link
        } else {
            node.next = head;
            head = node;
            tail.next = head;    // maintain circular property
        }

        size++;
    }

    // Insert at end
    public void insertAtEnd(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;    // new last node points to head
            tail = node;
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

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(data);
        node.next = temp.next;
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

        if (head == tail) {      // only one element
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;    // maintain circular link
        }

        size--;

        return value;
    }

    // Delete last node
    public int deleteEnd() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;

            // find second last node
            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = head;
            tail = temp;
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

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        int value = temp.next.data;
        temp.next = temp.next.next;

        size--;

        return value;
    }

    // -- UTIL --

    public int size() {
        return size;
    }

    // Display list
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}
