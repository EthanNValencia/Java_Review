import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SendEmail {

    public static void main(String [] args) {
        MyTimeTask task = new MyTimeTask();
        long delay = ChronoUnit.MILLIS.between(LocalTime.now(), LocalTime.of(11, 43, 45));
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(task, delay, TimeUnit.MILLISECONDS);
    }

}

class MyTimeTask extends TimerTask {

    public void run() {
        System.out.println(LocalTime.now());
    }
}