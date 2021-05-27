

public class Java_Loop_Examples {

    public static void main(String[] args){
        int counter = 0;

        // output the multiples of 5 less than 100
        for(int i = 5; i < 100; i++){
            if (i%5 == 0){
                System.out.println(i);
            }
        }

        // output the even numbers in descending order from 70 to 50, inclusively
        for(int i = 70; i >= 50; i--){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        // sum the numbers from 1 to 100, and output the result.
        for(int i = 0; i < 'd'; i++){
            counter+=i;
        }
        System.out.println(counter);
    }
}
