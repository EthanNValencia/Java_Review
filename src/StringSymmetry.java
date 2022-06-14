public class StringSymmetry {
    public static void main(String[] args){
        String str = "racecar";
        System.out.println(solution(str));
        str = "112211";
        System.out.println(solution(str));
        str = "x";
        System.out.println(solution(str));
        str = "xyzwas";
        System.out.println(solution(str));
    }

    public static int solution(String S){
        if(S.length() == 1) {
            return 0;
        }
        int start = 0;
        int end = S.length() - 1;
        int count = 0;
        int largestCount = -1;
        while(start < end) {
            if(S.charAt(start) == S.charAt(end)) {
                count++;
                if(largestCount < count) {
                    largestCount = count;
                }
            } else {
                count = 0;
            }
            start++;
            end--;
        }
        return largestCount;
    }
}
