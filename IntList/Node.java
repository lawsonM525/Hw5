package IntList;

public class Node {
    //make class variables private and implement getters and setters
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

    /**
     * Converts node to string by returning data as a string
     * @return String of data
     */
    public String toString(){ 
        return " "+data ;
    }

}