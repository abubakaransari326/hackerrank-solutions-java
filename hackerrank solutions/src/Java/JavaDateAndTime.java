package Java;

import java.time.LocalDate;

public class JavaDateAndTime {
  public static String findDay(int month, int day, int year) {
    LocalDate date = LocalDate.of(year, month, day);
    return date.getDayOfWeek().toString();

  }
}
