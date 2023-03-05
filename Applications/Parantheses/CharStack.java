package Applications.Parantheses;

public class CharStack {
    // CLASS DEFINES A STACK OF CHARACTERS

    // Class member variables
    private char[] stack;
    private int top;
    private int size;

    // Constructor
    public CharStack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;// top is the index of the top element in the stack
    }

    // Methods
    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Wrapper method for isEmpty()
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmptyW(){
        return isEmpty();
    }

    /**
     * Checks if the stack is full
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return (top == size - 1);
    }

    /**
     * Wrapper method for isFull()
     * @return true if the stack is full, false otherwise
     */
    public boolean isFullW(){
        return isFull();
    }

    /**
     * Peeks at the top of the stack
     */
    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        } else {
            return stack[top];
        }
    }

    /**
     * Wrapper method for peek()
     * @return character at the top of the stack
     */
    public char peekW(){
        return peek();
    }

    /**
     * Pushes a character onto the stack
     * @param c character to be pushed onto the stack
     */
    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = c;
        }
    }

    /**
     * Wrapper method for push()
     * @param c character to be pushed onto the stack
     */
    public void pushW(char c){
        push(c);
    }

    /**
     * Pops a character off the stack
     * @return character popped off the stack
     */
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        } else {
            char c = stack[top];
            top--;
            return c;
        }
    }

    /**
     * Wrapper method for pop()
     * @return character popped off the stack
     */
    public char popW(){
        return pop();
    }

    /**
     * Returns stack as a string
     */
    public String toString() {
        String s = "";
        for (int i = 0; i <= top; i++) {
            s += stack[i];
        }
        return s;
    }

    /**
     * Wrapper method for toString()
     * @return stack as a string
     */
    public String toStringW(){
        return toString();
    }


    
}
