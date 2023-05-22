package BasicProblems;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {
  public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    List<Integer> freq = new ArrayList<Integer>();

    for (int i = 0; i < 100; i++) {
      freq.add(0);
    }

    for (int value : arr) {

      freq.set(value, freq.get(value) + 1);
    }
    return freq;
  }
}
