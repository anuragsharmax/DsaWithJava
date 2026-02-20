package LinkedList;

/*
    == SINGLY LINKED LIST ==

    Structure:
        10 -> 20 -> 30 -> null

    Each node contains:
        - data
        - reference to next node

    Important Points:
    - head points to first node
    - tail points to last node
    - tail.next is always null
    - Last node stores null in next

    Key Characteristics:
    - Traversal only forward (no backward movement)
    - To delete last node, we must traverse to second last node
    - Insertion/deletion at head is O(1)

    Time Complexity:
    - Insert at start : O(1)
    - Insert at end   : O(1)  (because tail is maintained)
    - Insert at index : O(n)
    - Delete first    : O(1)
    - Delete last     : O(n)
    - Delete index    : O(n)

    Common Mistakes:
    - Forgetting to update tail when list becomes empty
    - Incorrect traversal position (index vs index-1 confusion)
*/

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

    // -- INSERT --

    // Insert at beginning
    public void insertAtStart(int data) {
        Node node = new Node(data);

        node.next = head;  // new node points to old head
        head = node;

        if (tail == null) {   // if list was empty
            tail = node;
        }

        size++;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node node = new Node(data);

        if (tail == null) {   // if list empty
            head = tail = node;
        } else {
            tail.next = node;
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

        // move to node just before index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;

        size++;
    }
    //insert using Recursion
    public void insertRec(int data,int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        head=insertRec(data,index,head);
    }
    private Node insertRec(int data,int index,Node node){
        if(index==0){
            Node newNode=new Node(data);
            newNode.next=node;
            size++;
            return newNode;
        }
        if(node == null){
            throw new IndexOutOfBoundsException();
        }
        node.next=insertRec(data,index-1,node.next);
        return node;
    }

    // -- DELETE --

    // Delete first node
    public int deleteFirst() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = head.data;
        head = head.next;

        if (head == null) {  // list became empty
            tail = null;
        }

        size--;

        return value;
    }

    // Delete last node
    public int deleteEnd() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        if (head == tail) {  // only one element
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        Node temp = head;

        // move to second last node
        while (temp.next != tail) {
            temp = temp.next;
        }

        int value = tail.data;
        temp.next = null;
        tail = temp;

        size--;

        return value;
    }

    // Delete at specific index
    public int deleteIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        Node temp = head;

        // move to node just before index
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
