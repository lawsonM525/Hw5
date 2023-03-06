public class IntList{

    Node head;

    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public String toString(){
        String listString = "";
        if (head==null) return "Empty list";

        listString += head.toString();
        Node current = head;
        while(current.next != null){
            listString += " -> " + current.next.toString();
            current = current.next;
        }

        return listString;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public int getElmtByIndex(int i){
        if (this.isEmpty()){
            System.out.println("List is empty.");
            return -1;
        }
        int count = 0; //index begins from 0
        Node current = head;
        while (current.next != null) {
            count+=1;
            if (count == i) {
                return current.next.data;
            }
            current = current.next;
        }        
        
        System.out.println("Index not found");
        return -1;
    }

    /**
     * delete element using a given index
     * @param i index of element to be deleted 
     */
    public void deleteElmtByIndex(int i){
        if (this.isEmpty()){
            System.out.println("List is empty.");
            return;
        }
        if (i == 0) { // If index is 0, delete the head node
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < i - 1) { // Traverse until the node before the index to be deleted
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) { // If index is out of bounds
            System.out.println("Index not found.");
            return;
        }
        current.next = current.next.next; // Delete the node at the given index
    }
    
    /**
     * changes element by a given index
     * @param i index of element to be changed
     * @param newData new data for the element
     */
    public void changeElmtByIndex(int i, int newData){
        if (this.isEmpty()){
            System.out.println("List is empty.");
            return;
        }
    
        int count = 0;
        Node current = head;
        while (current != null) {
            if (count == i) {
                current.data = newData;
                return;
            }
            count += 1;
            current = current.next;
        }
        System.out.println("Index not found");
    }
    

    // Recursive selection sort function
    public void selectionSort(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node min = head;
        Node current = head.next;
        while (current != null) {
            if (current.data < min.data) {
                min = current;
            }
            current = current.next;
        }
        swap(head, min);
        selectionSort(head.next);
    }

    //Wrapper for selection sort
    public void selectionSort(){
        selectionSort(head);
    }


    public static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }


}