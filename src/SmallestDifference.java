import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args){

        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] answer = smallestDifference(arrayOne, arrayTwo);
        System.out.println(answer[0] + " " + answer[1]);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] answer = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallestDifference = Integer.MAX_VALUE;
        int currentDifference = 0;
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int valueOne = arrayOne[idxOne];
            int valueTwo = arrayTwo[idxTwo];
            System.out.println("val1: " + valueOne + " val2: " + valueTwo);
            if(valueOne < valueTwo) {
                currentDifference = valueTwo - valueOne;
                idxOne++;
            } else if(valueOne > valueTwo) {
                currentDifference = valueOne - valueTwo;
                idxTwo++;
            } else { // This means they are equal.
                return new int[]{valueOne, valueTwo};
            }
            if(currentDifference < smallestDifference) {
                smallestDifference = currentDifference;
                answer = new int[]{valueOne, valueTwo};
            }

        }
        return answer;
    }
}
