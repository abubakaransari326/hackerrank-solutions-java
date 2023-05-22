package BasicProblems;

public class RecursiveDigitSum {
  public static int superDigit(String n, int k) {
    // Write your code here
    int x = 0;
    for (int i = 0; i < n.length(); i++) {
      if (i + 1 == n.length())
        x += Integer.parseInt(n.substring(i));
      else
        x += Integer.parseInt(n.substring(i, i + 1));
    }
    x = getSuperDigit(x);
    x = x * k;
    return getSuperDigit(x);
  }

  public static int getSuperDigit(int x) {
    int sup = 0;
    while (x > 0) {
      sup += x % 10;
      x /= 10;
    }
    if (sup > 10)
      return getSuperDigit(sup);
    return sup;

  }
}
