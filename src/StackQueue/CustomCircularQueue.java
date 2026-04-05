package StackQueue;

public class CustomCircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CustomCircularQueue(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
    }

    // insert element
    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("overflow");
            return;
        }

        rear = (rear + 1) % capacity; // circular move
        arr[rear] = x;
        size++;
    }

    // remove element
    int dequeue() {
        if (size == 0) {
            System.out.println("underflow");
            return -1;
        }

        int val = arr[front];
        front = (front + 1) % capacity; // circular move
        size--;

        return val;
    }

    // get front
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
        CustomCircularQueue q = new CustomCircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(60);
        q.enqueue(70);

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}