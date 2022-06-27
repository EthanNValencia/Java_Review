import java.time.LocalTime;

public class LocalTimePractice {

    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = LocalTime.parse("00:30");
        System.out.println(time);
    }

}
