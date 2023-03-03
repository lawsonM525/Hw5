package DataStructures.Queue;

public class CharQueueTesters {
    
    public static void testIsFull() {
        CharQueue queue = new CharQueue(3);
        queue.enqueue('a');
        queue.enqueue('b');
        System.out.println(queue.isFull()); // should print false
        queue.enqueue('c');
        System.out.println(queue.isFull()); // should print true
    }
    
    public static void testIsEmpty() {
        CharQueue queue = new CharQueue(3);
        System.out.println(queue.isEmpty()); // should print true
        queue.enqueue('a');
        System.out.println(queue.isEmpty()); // should print false
        queue.dequeue();
        System.out.println(queue.isEmpty()); // should print true
    }
    
    public static void testEnqueue() {
        CharQueue queue = new CharQueue(3);
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        System.out.println(queue.isFull()); // should print true
        queue.enqueue('d'); // should print "Queue is full"
    }
    
    public static void testDequeue() {
        CharQueue queue = new CharQueue(3);
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        System.out.println(queue.dequeue()); // should print 'a'
        System.out.println(queue.dequeue()); // should print 'b'
        System.out.println(queue.dequeue()); // should print 'c'
        System.out.println(queue.isEmpty()); // should print true
        System.out.println(queue.dequeue()); // should print "Queue is empty" and return '\0'
    }
    
    public static void main(String[] args) {
        System.out.println(" ====== PROGRAM STARTING =====");
        System.out.println(" ");
        System.out.println(" ======= TESTING ISFULL  =======");
        testIsFull();
        System.out.println(" ");
        System.out.println(" ======= TESTING ISEMPTY  =======");
        testIsEmpty();
        System.out.println(" ");
        System.out.println(" ======= TESTING ENQUEUE  =======");
        testEnqueue();
        System.out.println(" ");
        System.out.println(" ======= TESTING DEQUEUE  =======");
        testDequeue();
        System.out.println(" ");
        System.out.println(" ======= PROGRAM ENDS =======");
    }
}
