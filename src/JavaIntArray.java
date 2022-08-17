public class JavaIntArray {

    /***
     * Proof that an arrays superclass is an Object. (You didn't know this)
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array.getClass().getSuperclass());
    }

}
