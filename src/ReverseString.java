public class ReverseString {

    public static void main(String[] args){
        System.out.println(reverseString("Reverse this string!"));
    }

    public static String reverseString(String input) {
        if(input.equals("")){
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }

}
