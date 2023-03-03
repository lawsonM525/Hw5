package IntList;

public class IntListTester { //break up testers into tests into individual functions

    public static void testToString() {
        System.out.println(" ===== TESTING TOSTRING =====");
        IntList list = new IntList();
        System.out.println("Testing toString() method for empty list:");
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Appending a");
        list.append('a');
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Appending b");
        list.append('b');     
        System.out.println("String Result \"" + list.toString() + "\"");   
    }

    public static void testAppend() {
        System.out.println(" ===== TESTING APPEND =====");
        IntList list = new IntList();
        System.out.println("Testing append() method with one element:");
        System.out.println("Appending 6 to list");
        list.append(6);
        System.out.println("String Result: \"" + list.toString() + "\"");
        System.out.println("Appending 5 to list");
        list.append(5);
        System.out.println("String Result: \"" + list.toString() + "\"");
    }
    
    public static void testPrepend() {
        System.out.println(" ===== TESTING PREPEND =====");
        IntList list = new IntList();
        System.out.println("Testing prepend() method with one element:");
        System.out.println("Prepending 3 to list");
        list.prepend(3);
        System.out.println("String Result: \"" + list.toString() + "\"");
        System.out.println("Prepending 4 to list");
        list.prepend(4);
        System.out.println("String Result: \"" + list.toString() + "\"");
    }
    
    public static void testDeleteWithValue() {
        System.out.println(" ===== TESTING DELETEWITHVALUE =====");
        IntList list = new IntList();
        list.append(6);
        list.append(5);
        list.prepend(3);
        System.out.println("Testing deleteWithValue() method with multiple elements:");
        System.out.println("Deleting 6 from list");
        list.deleteWithValue(6);
        System.out.println("String Result: \"" + list.toString() + "\"");
        System.out.println("Deleting 5 from list");
        list.deleteWithValue(5);
        System.out.println("String Result: \"" + list.toString() + "\"");
    }
    
    
    

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testToString();
        System.out.println("");
        testAppend();
        System.out.println("");
        testPrepend();
        System.out.println("");
        testDeleteWithValue();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }
    
}
