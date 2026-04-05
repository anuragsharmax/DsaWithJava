package StackQueue;

public class CustomStack {
    int[] arr;
    int top;
    int capacity;

    CustomStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1; // empty stack
    }

    // push element
    void push(int x){
        if(top == capacity - 1){
            System.out.println("overflow");
            return;
        }
        arr[++top] = x;
    }

    // pop element
    int pop(){
        if(top == -1){
            System.out.println("underflow");
            return -1;
        }
        return arr[top--];
    }

    // get top element
    int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    // check empty
    boolean isEmpty(){
        return top == -1;
    }

    // size of stack
    int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        CustomStack st = new CustomStack(5);

        st.push(5);
        st.push(9);
        st.push(22);

        System.out.println("Pop: " + st.pop());
        System.out.println("Peek: " + st.peek());
    }
}