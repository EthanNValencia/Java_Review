import java.util.ArrayList;
import java.util.List;

public class MoveElementsToEnd {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(2); list.add(1); list.add(2); list.add(2); list.add(2);  list.add(3); list.add(4); list.add(2);
        System.out.println(moveElementToEnd(list, 2));
    }


    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start = 0;
        int end = array.size() - 1;
        while(start < end) {
            Integer starVal = array.get(start);
            Integer endVal = array.get(end);
            if(endVal == toMove) {
                end--;
            } else if(starVal == toMove) {
                swap(array, start, end);
                start++;
            } else {
                start++;
            }
        }
        return array;
    }

    public static void swap(List<Integer> array, int end, int start) {
        int holdStart = array.get(start);
        array.set(start, array.get(end));
        array.set(end, holdStart);
    }
}
