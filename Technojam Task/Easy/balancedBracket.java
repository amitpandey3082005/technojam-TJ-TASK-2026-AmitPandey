import java.util.*;

public class balancedBracket {
    public static boolean isBalncedString(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // check stack has openning bracket or not 
                if (stack.isEmpty()) {
                    return false; // No opening bracket to match
                }
                
                char top = stack.peek();
                // Check for valid pairs, return false if mismatch
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false; // Mismatched bracket
                }
            }
        }
        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{(}";
        System.out.println(isBalncedString(str)); // Prints false
    }
}
