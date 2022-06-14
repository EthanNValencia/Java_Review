public class NumberOfWaysToMakeChange {
    public static void main(String[] args) {
        System.out.println(numberOfWaysToMakeChange(10, new int[]{1, 5, 10, 25}));
    }
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n + 1];
        ways[0] = 1;
        for(int denom: denoms) {
            for(int amount = 1; amount < n + 1; amount++) {
                if(denom <= amount) {
                    ways[amount] += ways[amount - denom];
                    for(int way: ways) {
                        System.out.print(way + " ");
                    }
                    System.out.println();
                }
            }
        }
        return ways[n];
    }
}
