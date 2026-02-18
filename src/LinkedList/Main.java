package LinkedList;

public class Main {

    public static void main(String[] args) {

        //                SINGLY LINKED LIST

        LinkedListBasics ll = new LinkedListBasics();

        ll.insertAtStart(4);
        ll.insertAtStart(8);
        ll.insert(67, 2);
        ll.insertAtEnd(95);

        System.out.println("Singly Linked List:");
        ll.display();

        System.out.println("Deleted first: " + ll.deleteFirst());
        System.out.println("Deleted last: " + ll.deleteEnd());

        ll.insert(50, 1);
        System.out.println("After inserting 50 at index 1:");
        ll.display();

        System.out.println("Deleted at index 1: " + ll.deleteIndex(1));
        ll.display();


        System.out.println("\n=============\n");


        //                DOUBLY LINKED LIST

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtStart(10);
        dll.insertAtStart(20);
        dll.insert(30, 1);
        dll.insertAtEnd(40);

        System.out.println("Doubly Linked List (Forward):");
        dll.display();

        System.out.println("Doubly Linked List (Reverse):");
        dll.displayReverse();

        System.out.println("Deleted first: " + dll.deleteFirst());
        System.out.println("Deleted last: " + dll.deleteEnd());

        dll.insert(99, 1);
        System.out.println("After inserting 99 at index 1:");
        dll.display();

        System.out.println("Deleted at index 1: " + dll.deleteIndex(1));
        dll.display();


        System.out.println("\n==========\n");


        //                CIRCULAR LINKED LIST

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtStart(100);
        cll.insertAtStart(200);
        cll.insert(150, 1);
        cll.insertAtEnd(300);

        System.out.println("Circular Linked List:");
        cll.display();

        System.out.println("Deleted first: " + cll.deleteFirst());
        System.out.println("Deleted last: " + cll.deleteEnd());

        cll.insert(175, 1);
        System.out.println("After inserting 175 at index 1:");
        cll.display();

        System.out.println("Deleted at index 1: " + cll.deleteIndex(1));
        cll.display();
    }
}
