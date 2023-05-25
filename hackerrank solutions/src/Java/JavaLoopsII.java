package Java;

import java.util.Scanner;

public class JavaLoopsII {
  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();

      int calc = 0;
      for (int j = 0; j <= n - 1; j++) {
        if (j == 0)
          calc += a + ((int) Math.pow(2, 0) * b);
        else
          calc += (int) Math.pow(2, j) * b;
        System.out.print(calc + " ");
      }
      System.out.println();
    }
    in.close();
  }
}
