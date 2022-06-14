import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4);
        Practice practice = new Practice();
        String answer = practice.doIt(list);
        System.out.println("Test: " + answer);
    }

    public String doIt(ArrayList<Integer> numbers) {
        ArrayList<Integer> nums = new ArrayList<>();
        if(numbers.size() == 2) {
            return numbers.get(0) + "" + numbers.get(1);
        }
        for(int i = 0; i < numbers.size()-1; i++) {
            int sum = numbers.get(i);
            if(i+1 < numbers.size()){
                sum += numbers.get(i+1);
                if(sum >= 10){
                    sum %= 10;
                }
            }
            nums.add(sum);
        }
        return doIt(nums);
    }
}
