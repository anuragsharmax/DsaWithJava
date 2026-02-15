package LinkedList;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedListBasics ll=new LinkedListBasics();
        ll.insertAtStart(4);
        ll.insertAtStart(8);
        ll.insert(67,2);
        ll.insertAtEnd(95);
        ll.display();
        System.out.println("deleted element is: "+ll.deleteFirst());
        System.out.println("deleted element is :"+ll.deleteEnd());
        ll.display();
    }
}
