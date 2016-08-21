import java.time.Instant;
public class DateGame {
    public static String api4Call(String date, int interval) {
        Instant t = Instant.parse(date);
        String ans = t.plusSeconds(interval).toString();
        System.out.println(ans);
        return ans;
    }
}