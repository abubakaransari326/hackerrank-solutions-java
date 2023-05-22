package Intermediate;

import java.util.Stack;

public class BalancedBrackets {
  public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> brackets = new Stack<>();

    for (char bracket : s.toCharArray()) {
      if (bracket == '(' || bracket == '{' || bracket == '[')
        brackets.push(bracket);
      else if (bracket == ')') {
        if (brackets.isEmpty() || brackets.pop() != '(')
          return "NO";
      } else if (bracket == '}') {
        if (brackets.isEmpty() || brackets.pop() != '{')
          return "NO";
      } else if (bracket == ']') {
        if (brackets.isEmpty() || brackets.pop() != '[')
          return "NO";
      }
    }
    if (!brackets.isEmpty())
      return "NO";
    return "YES";
  }
}
