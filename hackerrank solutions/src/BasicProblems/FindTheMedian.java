package BasicProblems;

import java.util.List;
import java.util.stream.Collectors;

public class FindTheMedian {
  public static int findMedian(List<Integer> arr) {
    // Write your code here
    arr = arr.stream().sorted().collect(Collectors.toList());
    int middle = arr.size() / 2;
    return arr.get(middle);
  }

}
