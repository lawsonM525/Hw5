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


    public void deleteElmtByIndex(int i){
        if (this.isEmpty()){
            System.out.println("List is empty.");
            return;
        }
    }

    //TODO: Change Element by Index y

}