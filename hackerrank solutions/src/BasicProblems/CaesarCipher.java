package BasicProblems;

public class CaesarCipher {
  public static String caesarCipher(String s, int k) {
    // Write your code here
    String response = "";
    k = k % 26;
    for (char c : s.toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        if (c + k > 'z') {
          response += (char) (k - ('z' - c) + 'a' - 1);
        } else {
          response += (char) (c + k);
        }

      } else if (c >= 'A' && c <= 'Z') {
        if (c + k > 'Z') {
          response += (char) (k - ('Z' - c) + 'A' - 1);
        } else {
          response += (char) (c + k);
        }
      } else {
        response += c;
      }
    }
    return response;
  }
}
