package Algorithms;

public class Helpers {

    /**
     * prints an array
     * @param array array to be printed
     */
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * swaps two elements in an array
     * @param arr
     * @param i index of first element to be swapped
     * @param j index of second element to be swapped
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
