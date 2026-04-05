package StackQueue;

public class CustomQueue {
    int[] arr;
    int front, rear, size;

    CustomQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (size == arr.length) {
            System.out.println("overflow");
            return;
        }
        arr[++rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("underflow");
            return -1;
        }
        int val = arr[front++];
        size--;
        return val;
    }

    int peek() {
        if (size == 0) {
            System.out.println("underflow");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Peek: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.dequeue());
        }

        System.out.println("Removed: " + q.dequeue());
    }
}