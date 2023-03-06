public class Helpers {

    // Helper function to swap two nodes in the linked list
    public static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
