package Java;

import java.util.Scanner;

public class JavaEndOfFile {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int count = 1;
    while (input.hasNext()) {
      System.out.println(count + " " + input.nextLine());
      count++;
    }
    input.close();
  }
}
