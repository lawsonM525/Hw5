package Applications.Parantheses;

public class Parentheses {
    private static final char[] openBrackets = {'(', '[', '{','<'};
    private static final char[] closeBrackets = {')', ']', '}','>'};
    
    /**
     * checks whether a character is an open bracket
     * @param c character to be checked
     * @return T/F : whether or not character is an open bracket
     */
    public static boolean isOpenBracket(char c) {
        for (char bracket : openBrackets) {
            if (bracket == c) {
                return true;
            }
        }
        return false;
    }

    /**
     * checks whether a character is a closed bracket
     * @param c character to be checked
     * @return T/F : whether or not character is a closed bracket
     */
    public static boolean isCloseBracket(char c) {
        for (char bracket : closeBrackets) {
            if (bracket == c) {
                return true;
            }
        }
        return false;
    }

    /**
     * checks whether two brackets are matching open and close brackets
     * @param open open bracket to be checked
     * @param close closed bracket to be checked
     * @return T/F: whether or not brackets match
     */
    public static boolean bracketsMatch(char open, char close) {
        int openIndex = Helpers.findIndex(openBrackets, open);
        int closeIndex = Helpers.findIndex(closeBrackets, close);
        return openIndex == closeIndex;
    }
    

    /**
     * checks full string to see if all brackets match
     * @param s String to be checked
     * @return T/F
     */
    public static boolean checkFullArray(String s) {
        CharStack stack = new CharStack(5);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (!bracketsMatch(last, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * checks full array of characters
     */
    public static boolean checkFullArray(char[] s){
        return checkFullArray(Helpers.toString(s));
    } 
}
