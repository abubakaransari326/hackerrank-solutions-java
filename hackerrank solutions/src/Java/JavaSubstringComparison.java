package Java;

public class JavaSubstringComparison {
  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    for (int i = 1; i <= s.length() - k; i++) {
      String s1 = s.substring(i, i + k);
      if (s1.compareTo(largest) > 0)
        largest = s1;
      else if (s1.compareTo(smallest) < 0)
        smallest = s1;
    }
    return smallest + "\n" + largest;
  }
}
