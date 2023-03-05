package Applications.Parantheses;

public class Helpers {

    /**
     * finds the index of a character within an array
     * @param arr array being looked through
     * @param c char being searched for
     * @return index i
     */
    public static int findIndex(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Converts character array to string
     * @param arr character array to be converted
     * @return String containing the characters in the array
     */
    public static String toString(char[] arr) {
        String result = "";
        for (char c : arr) {
            result += c;
        }
        return result;
    }
    
    
}
