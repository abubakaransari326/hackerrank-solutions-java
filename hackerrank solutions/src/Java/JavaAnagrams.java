package Java;

public class JavaAnagrams {
  static boolean isAnagram(String a, String b) {
    
    a = a.toLowerCase();
    b = b.toLowerCase();

    a = a.chars()
        .sorted()
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    b = b.chars()
        .sorted()
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();

    return a.equalsIgnoreCase(b);

  }
}
