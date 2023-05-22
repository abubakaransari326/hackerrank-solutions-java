package BasicProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
  public static String gridChallenge(List<String> grid) {
    // Write your code here
    List<String> sorted = new ArrayList();
    for (String s : grid) {
      char[] temp = s.toCharArray();
      Arrays.sort(temp);
      sorted.add(new String(temp));
    }

    char temp = 'a';

    for (int i = 0; i < sorted.get(0).length(); i++) {
      temp = 'a';
      for (String s : sorted) {
        if (s.charAt(i) < temp)
          return "NO";
        temp = s.charAt(i);
      }
    }

    return "YES";
  }
}
