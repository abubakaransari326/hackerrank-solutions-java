public class PalindromeIndex {


  //Palindrome Index
  public int palindromeIndex(String s) {
    // Write your code here
    int len = s.length();
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1)) {
        if (isPalindrome(s.substring(i, len - i - 1))) {
          return len - i - 1;
        } else if (isPalindrome(s.substring(i + 1, len - i))) {
          return i;
        } else
          return -1;
      }
    }
    return -1;
  }

  public static boolean isPalindrome(String s) {
    int len = s.length();
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1))
        return false;
    }
    return true;
  }
}
