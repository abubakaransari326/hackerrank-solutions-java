package Intermediate;

import java.util.Scanner;
import java.util.Stack;

class Operations {
  int operation;
  String value;

  public Operations(int operation, String value) {
    this.operation = operation;
    this.value = value;
  }
}


public class SimpleTextEditor {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Stack<Operations> operations = new Stack<>();

    Scanner input = new Scanner(System.in);

    int noOfOperations = input.nextInt();
    int operation;
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < noOfOperations; i++) {
      operation = input.nextInt();
      switch (operation) {
        case 1:
          String temp = input.next();
          result.append(temp);
          operations.push(new Operations(1, temp));
          break;
        case 2:
          int chars = input.nextInt();
          operations.push(new Operations(2, result.substring(result.length() - chars)));
          result.delete(result.length() - chars, result.length());
          break;
        case 3:
          int k = input.nextInt();
          System.out.println(result.charAt(k - 1));
          break;
        case 4:
          Operations tempOp = operations.pop();
          if (tempOp.operation == 1) {
            result.delete(result.length() - tempOp.value.length(), result.length());
          } else {
            result.append(tempOp.value);
          }
          break;
      }

    }
  }
}
