package LinkedList;

/*
    ================= MERGE SORT ON SINGLY LINKED LIST =================

    Why Merge Sort?

    - Linked list does NOT allow random access.
    - Quick sort is inefficient due to pointer rearrangement complexity.
    - Merge sort works naturally because:
        1. We can split list using slow-fast pointer.
        2. Merging sorted lists only requires pointer adjustments.
    - Time Complexity: O(n log n)
    - Space Complexity: O(log n) (recursion stack)

    Core Idea:
    1. Divide list into two halves.
    2. Recursively sort each half.
    3. Merge the sorted halves.
*/

public class MergeSortLinkedList {

    /*
        ================= NODE CLASS =================

        Each node contains:
        - data
        - reference to next node

        It is private because:
        - It should not be accessed outside this class.
        - It is internal implementation detail.
    */
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Head pointer of linked list
    private Node head;

    /*
        ================= INSERT =================

        Inserts element at the end.
        Time Complexity: O(n)
    */
    public void insert(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    /*
        ================= DISPLAY =================

        Traverses and prints the list.
        Time Complexity: O(n)
    */
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    /*
        ================= SORT WRAPPER =================

        Public method.
        Calls recursive mergeSort and updates head.
    */
    public void sort() {
        head = mergeSort(head);
    }

    /*
        ================= MERGE SORT =================

        Recursively sorts the linked list.

        Base Case:
            - If list is empty
            - If list has one element
            -> Already sorted
    */
    private Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        /*
            Step 1: Find Middle using Slow-Fast Pointer

            slow moves 1 step
            fast moves 2 steps

            When fast reaches end,
            slow is at middle.
        */
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        /*
            Important Step:
            Break the list into two halves.

            Without this line,
            recursion would never reduce problem size.
        */
        prev.next = null;

        // Step 2: Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(slow);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    /*
        ================= MERGE FUNCTION =================

        Merges two sorted linked lists.

        Key Invariant:
        - At every step, attach smaller node.
        - Maintain sorted order.
    */
    private Node merge(Node left, Node right) {

        /*
            Dummy node simplifies edge cases.
            It avoids handling "first element" separately.
        */
        Node dummy = new Node(0);
        Node temp = dummy;

        /*
            Compare elements one by one.
            Loop runs while BOTH lists have nodes.
        */
        while (left != null && right != null) {

            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        /*
            After loop:
            One list is null.
            Attach the remaining list directly.
        */
        if (left != null) temp.next = left;
        if (right != null) temp.next = right;

        /*
            We return dummy.next
            because dummy itself is artificial helper node.
        */
        return dummy.next;
    }

    /*
        ================= MAIN =================

        Example execution.
    */
    public static void main(String[] args) {

        MergeSortLinkedList list = new MergeSortLinkedList();

        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(3);

        System.out.println("Before Sorting:");
        list.display();

        list.sort();

        System.out.println("After Sorting:");
        list.display();
    }
}
