import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

    long sum = 0;
    for (int value : arr) {
      sum += value;
    }
    long min = Collections.min(arr);
    long max = Collections.max(arr);
    long minSum = sum - max;
    long maxSum = sum - min;
    System.out.print(minSum + " " + maxSum);
  }
}
