package Intermediate;

import java.util.Collections;
import java.util.List;

public class Pairs {
  public static int pairs(int k, List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int count = 0;
    for (int i = 0; i < arr.size() - 1; i++) {
      for (int j = i + 1; j < arr.size(); j++) {
        if (arr.get(j) - arr.get(i) == k)
          count++;
        if (arr.get(j) - arr.get(i) > k)
          break;
      }
    }

    return count;
  }

}
