import java.time.LocalTime;

public class LocalTimePractice {

    public static void main(String[] args){
        LocalTime timeOne = LocalTime.now();
        System.out.println("timeOne: " + timeOne);
        LocalTime timeTwo = LocalTime.parse("02:30");
        System.out.println("timeTwo: " + timeTwo);
        System.out.println(timeOne.compareTo(timeTwo)); // time1 more than time2 == 1
        System.out.println(timeTwo.compareTo(timeOne)); // time2 less than time1 == -1
        System.out.println(timeTwo.compareTo(timeTwo)); // time2 equals time2 == 0
    }

}
