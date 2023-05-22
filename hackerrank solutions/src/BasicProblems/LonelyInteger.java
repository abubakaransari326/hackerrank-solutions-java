package BasicProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
  public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    List<Integer> b = new ArrayList(a);
    return a.stream().distinct().filter((value) -> Collections.frequency(b, value) == 1).findFirst().get();

  }
}
