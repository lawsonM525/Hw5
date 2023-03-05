package Applications.Parantheses;
public class TesterParentheses{

    /**
     * tests isOpenBracket method 
     */
    public static void testIsOpenBracket(){
        System.out.println("Testing isOpenBracket");
        System.out.println("Character is {");
        System.out.println("Character is open bracket is " + Parentheses.isOpenBracket('{'));
        System.out.println("Character is ]");
        System.out.println("Character is open bracket is " + Parentheses.isOpenBracket(']'));
        System.out.println("Character is o");
        System.out.println("Character is open bracket is " + Parentheses.isOpenBracket('o'));
    }

    public static void testIsCloseBracket(){
        System.out.println("Testing isCloseBracket");
        System.out.println("Character is }");
        System.out.println("Character is close bracket is " + Parentheses.isCloseBracket('}'));
        System.out.println("Character is [");
        System.out.println("Character is close bracket is " + Parentheses.isCloseBracket('['));
        System.out.println("Character is p");
        System.out.println("Character is close bracket is " + Parentheses.isCloseBracket('p'));
    }
    
    public static void testMatchingBrackets(){
        System.out.println("Testing matchingBrackets");
        System.out.println("Matching brackets for {}?");
        System.out.println("Matching brackets? " + Parentheses.bracketsMatch('{', '}'));
        System.out.println("Matching brackets for (>?");
        System.out.println("Matching brackets? " + Parentheses.bracketsMatch('(', ')'));
    }
    
    public static void testCheckFullArray(){
        System.out.println("Testing checkFullArray");
        char[][] arrays = {
            {'(', ')', '{', '}', '[', ']'},
            {'(', '[', ')', ']'},
            {'{', '[', '(', ')', ']', '}'},
            {'[', ']'}
        };
        for (char[] array : arrays) {
            System.out.println("Array is " + Helpers.toString(array));
            System.out.println("Full array? " + Parentheses.checkFullArray(array));
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Parentheses tests...");
        System.out.println(" ");
        System.out.println("=======================");
        System.out.println(" ");
        testIsOpenBracket();
        System.out.println(" ");
        System.out.println("=======================");
        System.out.println(" ");
        testIsCloseBracket();
        System.out.println(" ");
        System.out.println("=======================");
        System.out.println(" ");
        testMatchingBrackets();
        System.out.println(" ");
        System.out.println("=======================");
        System.out.println(" ");
        testCheckFullArray();
        System.out.println(" ");
        System.out.println("=======================");
        System.out.println(" ");
        System.out.println("Parentheses tests complete.");
    }
    


}