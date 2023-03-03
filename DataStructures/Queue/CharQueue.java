package DataStructures.Queue;

public class CharQueue{
    private int maxSize; // maximum size of the queue
    private char[] queue; // array to store elements of the queue
    private int front; // front index of the queue
    private int rear; // rear index of the queue

    // Constructor 
    public CharQueue(int size) {
        maxSize = size;
        queue = new char[maxSize];
        front = -1;
        rear = -1;
    }

    /**
     * Checks if the queue is full
     * @return
     */
    public boolean isFull() {
        if ((rear + 1) % maxSize == front) {
            return true;
        } else {
            return false;
        }
    }

    // method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // method to add an element to the queue
    public void enqueue(char element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % maxSize;
            queue[rear] = element;
        }
    }

    // method to remove an element from the queue
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\0';
        } else {
            char element = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
            return element;
        }
    }
}
