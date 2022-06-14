public class Java_ArrayOfProducts {

    public static void main(String[] args){
        int[] array = {5, 1, 4, 2};
        array = arrayOfProducts(array);
        // array = new int[array.length];
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        int leftRunningProduct = 1;
        for(int i = 0; i < array.length; i++) {
            products[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }
        return products;
    }

}
