package Java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
  static Scanner input = new Scanner(System.in);
  static int B = input.nextInt();
  static int H = input.nextInt();

  static {
    try {
      if (B <= 0 || H <= 0)
        throw new Exception();
      System.out.println(B * H);
    } catch (Exception e) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

  }
}
