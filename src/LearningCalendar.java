import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LearningCalendar {

    public static void main(String[] args) throws ParseException {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println(tomorrow);

        LocalDate date2 = LocalDate.now();
        System.out.println(date.isEqual(date2));

    }

}
