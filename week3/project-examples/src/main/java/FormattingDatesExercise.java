import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingDatesExercise {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        // 04/22/2026
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // 2026-04-22
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Wednesday, April 22, 2026
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        // Wednesday, Apr 22, 2026 10:02
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm");

        System.out.println(ldt.format(dtf1));
        System.out.println(ldt.format(dtf2));
        System.out.println(ldt.format(dtf3));
        System.out.println(ldt.format(dtf4));

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy", Locale.GERMAN);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt.format(dtf5));
    }
}
