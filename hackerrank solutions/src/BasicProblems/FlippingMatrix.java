package BasicProblems;

import java.util.List;

public class FlippingMatrix {
  public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    int sum = 0;
    int max = 0;
    int size = matrix.size();
    for (int i = 0; i < size / 2; i++) {

      for (int j = 0; j < size / 2; j++) {
        max = Integer.MIN_VALUE;

        if (matrix.get(i).get(j) > max)
          max = matrix.get(i).get(j);

        if (matrix.get(i).get(size - j - 1) > max)
          max = matrix.get(i).get(size - j - 1);

        if (matrix.get(size - i - 1).get(j) > max)
          max = matrix.get(size - i - 1).get(j);

        if (matrix.get(size - i - 1).get(size - j - 1) > max)
          max = matrix.get(size - i - 1).get(size - j - 1);

        sum += max;
      }
    }
    return sum;
  }

}
