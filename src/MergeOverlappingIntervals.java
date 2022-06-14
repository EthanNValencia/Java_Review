import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] array = {{1,2},{3,5},{4,7},{6,8},{9,10}};
        int[][] returnArr = mergeOverlappingIntervals(array);
        print(returnArr);
    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sorted = intervals.clone();
        Arrays.sort(sorted, (a, b) -> Double.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sorted[0];
        mergedIntervals.add(currentInterval);

        for(int[] nextInterval : sorted) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            System.out.println("ASSIGN: currentEnd: " + currentEnd + " nextStart: " + nextStart + " nextEnd: " + nextEnd);

            if(currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
                System.out.println("    IF: currentEnd: " + currentEnd + " nextStart " + nextStart + " nextEnd: " + nextEnd);
                // printArray(currentInterval);
            } else {
                // System.out.println("  ELSE: currentEnd: " + currentEnd + " nextStart " + nextStart + " nextEnd: " + nextEnd);
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
                System.out.println("  ELSE: currentEnd: " + currentEnd + " nextStart " + nextStart + " nextEnd: " + nextEnd);
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void print(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
