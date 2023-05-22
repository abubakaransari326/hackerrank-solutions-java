package BasicProblems;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {
  public static String timeConversion(String s) {
    // Write your code here
    return LocalTime.parse(
            s,
            DateTimeFormatter.ofPattern(
                "hh:mm:ssa",
                Locale.US
            )
        )
        .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }
}
