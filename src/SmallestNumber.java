/*
This is a demo task.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited
 */

import java.util.Arrays;
import java.util.HashMap;

public class SmallestNumber {
    public static void main(String[] args){
        int[] arr = {1, 3, 6, 4, 1, 2};
        System.out.println("Answer " + solution(arr));

        int[] arr2 = {1, 2, 3};
        System.out.println("Answer " + solution(arr2));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        for(int i = 0; i < A.length; i++) {
            hashMap.put(A[i], 1);
        }
        for(int i = 0; i < A.length + 2; i++) {
            System.out.println(i);
            if(!hashMap.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
