public class LongestPeak {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));
    }

    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        int pos = 1;
        while(pos < array.length - 1) {
            if(array[pos] > array[pos-1] && array[pos] > array[pos+1]) { // peak has been found
                int potPeak = 3;
                for(int i = pos - 2; i >= 0; i--) {
                    if(array[i + 1] > array[i]) {
                        potPeak += 1;
                    } else {
                        break;
                    }
                }
                for(int i = pos + 2; i < array.length; i++) {
                    if(array[i - 1] > array[i]) {
                        potPeak += 1;
                        System.out.println("i : " + i);
                    } else {
                        pos = i - 1;
                        break;
                    }
                }
                if(potPeak > longestPeak)
                    longestPeak = potPeak;
            }
            pos++; // increments position
        }
        return longestPeak;
    }
}
