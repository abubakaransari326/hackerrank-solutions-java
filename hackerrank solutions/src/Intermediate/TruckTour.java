package Intermediate;

import java.util.List;

public class TruckTour {

  public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here

    for (int i = 0; i < petrolpumps.size(); i++) {
      if (petrolpumps.get(i).get(0) >= petrolpumps.get(i).get(1) && isTraversable(petrolpumps, i))
        return i;

    }
    return -1;
  }

  public static boolean isTraversable(List<List<Integer>> petrolpumps, int i) {
    int petrol = 0;

    for (int j = i; j < petrolpumps.size(); j++) {
      petrol += petrolpumps.get(j).get(0);
      petrol -= petrolpumps.get(j).get(1);
      if (petrol < 0)
        return false;
    }

    for (int j = 0; j < i; j++) {
      petrol += petrolpumps.get(j).get(0);
      petrol -= petrolpumps.get(j).get(1);
      if (petrol < 0)
        return false;
    }

    return true;
  }
}
