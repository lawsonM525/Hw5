package IntList;

public class IntListTester { //break up testers into tests into individual functions

    public static void intListTest(){
        IntList list = new IntList();
        System.out.println("Converting new empty list to string");
        System.out.println(list.toString());
        System.out.println("Appending 6 to list");
        list.append(6);
        System.out.println(list.toString());
        System.out.println("Appending 5 to list");
        list.append(5);
        System.out.println(list.toString());
        System.out.println("Prepending 3 to list");
        list.prepend(3);
        System.out.println(list.toString());
        System.out.println("Deleting 6");
        list.deleteWithValue(6);
        System.out.println(list.toString());
    }

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        intListTest();
        System.out.println("===== PROGRAM ENDED =====");
    }
    
}
