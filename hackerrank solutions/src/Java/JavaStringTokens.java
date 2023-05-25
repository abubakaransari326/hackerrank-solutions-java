package Java;

import java.util.Scanner;

public class JavaStringTokens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    boolean found = false;
    for (int i = 0; i < s.length(); i++) {
      int t = s.charAt(i);
      if (65 <= t && t <= 90 || t >= 97 && t <= 112) {
        found = true;
        break;
      }
    }
    if (found) {
      String[] splits = s.split("[, '@_.?!]+");
      int length = splits.length;
      if (splits[0].length() == 0 || splits[splits.length - 1].length() == 0)
        length--;
      System.out.println(length);

      for (String split : splits) {
        if (split.length() != 0)
          System.out.println(split);
      }
    } else
      System.out.println(0);

    scan.close();
  }
}
