package DataStructures.Stack;

public class CharStackTesters {

    /**
     * tests isEmpty method
     */
    public static void testIsEmpty() {
        CharStack stack = new CharStack(5);
        System.out.println(" ==== Test isEmpty() ====");
        System.out.println("This is our stack: " + stack);
        System.out.println("Stack is empty: " + stack.isEmpty());
    }

    /**
     * tests isFull method
     */
    public static void testIsFull() {
        CharStack stack = new CharStack(5);
        System.out.println(" ==== Test isFull() ====");
        System.out.println("This is our stack: " + stack);
        System.out.println("Stack is full: " + stack.isFull());
    }

    /**
     * tests push method
     */
    public static void testPush() {
        CharStack stack = new CharStack(5);
        System.out.println(" ==== Test push() ====");
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'a' onto the stack");
        stack.push('a');
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'b' onto the stack");
        stack.push('b');
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'c' onto the stack");
        stack.push('c');
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'd' onto the stack");
        stack.push('d');
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'e' onto the stack");
        stack.push('e');
        System.out.println("This is our stack: " + stack);
        System.out.println("Pushing 'f' onto the stack");
        stack.push('f');
        System.out.println("This is our stack: " + stack);
    }

    /**
     * tests pop method
     */
    public static void testPop(){
        CharStack stack = new CharStack(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(" ==== Test pop() ====");
        System.out.println("This is our stack: " + stack);
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack);
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack);
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack);
    }

    /**
     * tests peek method
     */
    public static void testPeek(){
        CharStack stack = new CharStack(5);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(" ==== Test peek() ====");
        System.out.println("This is our stack: " + stack);
        System.out.println("Peeking at the top of the stack");
        stack.peek();
        System.out.println("This is our stack: " + stack);
    }


    // Main method
    public static void main(String[] args) {
        System.out.println(" ==== Starting Tests ====");
        System.out.println();
        testIsEmpty();
        System.out.println();
        testIsFull();
        System.out.println();
        testPush();
        System.out.println();
        testPop();
        System.out.println();
        testPeek();
        System.out.println();
        System.out.println(" ==== Ending Tests ====");
    }
    
}