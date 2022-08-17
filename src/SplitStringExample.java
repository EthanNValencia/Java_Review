public class SplitStringExample {

    public static void main(String[] args){
        String str = "MANAGER*hello@game.com";
        String[] split = str.split("\\*");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }

}
