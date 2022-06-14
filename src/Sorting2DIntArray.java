import java.util.Arrays;

public class Sorting2DIntArray {

    public static void main(String[] args) {
        int[][] array = {{3,5},{1,2},{4,7},{9,10},{6,8}};
        print(array);
        Arrays.sort(array, (a, b) -> Double.compare(a[0], b[0]));
        print(array);
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
