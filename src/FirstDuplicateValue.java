import java.util.HashMap;

public class FirstDuplicateValue {

    public static void main(String[] args){
        int[] array = {2,1,5,2,3,3,4};
        System.out.println(firstDuplicateValue(array));
    }

    public static int firstDuplicateValue(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            if(hashMap.containsKey(array[i])) {
                return array[i];
            } else {
                hashMap.put(array[i], 1);
            }
        }
        return -1;
    }

}
