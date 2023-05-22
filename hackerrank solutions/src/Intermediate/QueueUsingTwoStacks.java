package Intermediate;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int queries = Integer.parseInt(input.nextLine());

    String query;
    Queue q1 = new Queue();
    for (int i = 0; i < queries; i++) {
      query = input.nextLine();
      if (query.equals("2")) {
        q1.dequeue();
      } else if (query.equals("3")) {
        q1.printFirst();
      } else {
        q1.enqueue(Integer.parseInt(query.substring(2)));
      }

    }
  }
}


class Queue {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  public void enqueue(int x) {
    stack1.push(x);
  }

  public int dequeue() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty())
        stack2.push(stack1.pop());
    }
    return stack2.pop();
  }

  public void printFirst() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty())
        stack2.push(stack1.pop());
    }
    System.out.println(stack2.peek());
  }
}
