import java.time.Instant;
public class DateGame {
    public static void main(String args[]) {
        String date = "2016-08-29T02:48:28Z";
        int interval = 134312;
        Instant t = Instant.parse(date);
        System.out.println(t.plusSeconds(interval));
    }
}