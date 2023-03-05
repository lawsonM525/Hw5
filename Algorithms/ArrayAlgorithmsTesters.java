package Algorithms;
public class ArrayAlgorithmsTesters {


    // Testers for ArrayAlgorithm.java

    /**
     * tests addAll method 
     */
    public static void testAddAll(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test addAll() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Sum of array: " + ArrayAlgorithms.addAll(array));
    }

    /**
     * tests addAllRec method 
     */
    public static void testAddAllRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test addAllRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Sum of array: " + ArrayAlgorithms.addAllRec(array));
    }

    /**
     * tests multiplyAll method 
     */
    public static void testMultiplyAll(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test multiplyAll() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Product of array: " + ArrayAlgorithms.multiplyAll(array));
    }

    /**
     * tests multiplyAllRec method 
     */
    public static void testMultiplyAllRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test multiplyAllRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Product of array: " + ArrayAlgorithms.multiplyAllRec(array));
    }

    /**
     * tests isElement method 
     */
    public static void testIsElement(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test isElement() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Is 3 in array? " + ArrayAlgorithms.isElement(array, 3));
        System.out.println("Is 6 in array? " + ArrayAlgorithms.isElement(array, 6));
    }

    /**
     * tests isElementRec method 
     */
    public static void testIsElementRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test isElementRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Is 3 in array? " + ArrayAlgorithms.isElementRec(array, 3));
        System.out.println("Is 6 in array? " + ArrayAlgorithms.isElementRec(array, 6));
    }

    /**
     * tests findMax method 
     */
    public static void testFindMax(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test findMax() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Max of array: " + ArrayAlgorithms.findMax(array));
    }

    /**
     * tests findMaxRec method 
     */
    public static void testFindMaxRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test findMaxRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Max of array: " + ArrayAlgorithms.findMaxRec(array));
    }

    /**
     * tests findMin method 
     */
    public static void testFindMin(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test findMin() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Min of array: " + ArrayAlgorithms.findMin(array));
    }

    /**
     * tests findMinRec method 
     */
    public static void testFindMinRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test findMinRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Min of array: " + ArrayAlgorithms.findMinRec(array));
    }

    /**
     * tests reverse method
     */
    public static void testReverse(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test reverse() ====");
        System.out.println("Array: ");
            
        Helpers.printArray(array);
        System.out.println("Reversed array: ");
        Helpers.printArray(ArrayAlgorithms.reverse(array));
    }

    /**
     * tests reverseRec method
     */
    public static void testReverseRec(){
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(" ==== Test reverseRec() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Reversed array: ");
        Helpers.printArray(ArrayAlgorithms.reverseRec(array));
    }

    /**
     * Tests binarySearch method
     */
    public static void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("==== Test binarySearch() ====");
        System.out.println("Array: ");
        Helpers.printArray(array);
        System.out.println("Index of 3: " + ArrayAlgorithms.binarySearch(array, 3, 0, array.length-1));
        System.out.println("Index of 6: " + ArrayAlgorithms.binarySearch(array, 6, 0, array.length-1));
    }

    // Main method
    public static void main(String[] args) {
        testAddAll();
        testAddAllRec();
        testMultiplyAll();
        testMultiplyAllRec();
        testIsElement();
        testIsElementRec();
        testFindMax();
        testFindMaxRec();
        testFindMin();
        testFindMinRec();
        testReverse();
        testReverseRec();
        testBinarySearch();
    }
}
