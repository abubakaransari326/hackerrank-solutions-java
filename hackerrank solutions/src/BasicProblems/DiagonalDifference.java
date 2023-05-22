package BasicProblems;

import java.util.List;

public class DiagonalDifference {
  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here

    int sum1 = 0;
    int sum2 = 0;
    int[] diagonal1Indices = {0, 0};
    int[] diagonal2Indices = {0, arr.size() - 1};

    for (int i = 0; i < arr.size(); i++) {
      sum1 += arr.get(diagonal1Indices[0]).get(diagonal1Indices[1]);
      diagonal1Indices[0] += 1;
      diagonal1Indices[1] += 1;
      sum2 += arr.get(diagonal2Indices[0]).get(diagonal2Indices[1]);
      diagonal2Indices[0] += 1;
      diagonal2Indices[1] -= 1;
    }

    return Math.abs(sum1 - sum2);
  }

}
