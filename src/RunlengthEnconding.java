public class RunlengthEnconding {
    public static void main(String[] args) {
        System.out.println(encode("AAAAAAAAAAAAAAAAABBCCCCDD"));
    }

    public static String encode(String string){
        StringBuilder sb = new StringBuilder();
        int currentLength = 1;
        for(int i = 1; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);
            if((currentCharacter != previousCharacter) || (currentLength == 9)) {
                sb.append(currentLength);
                sb.append(previousCharacter);
                currentLength = 0;
            }
            currentLength += 1;
        }
        sb.append(currentLength);
        sb.append(string.charAt(string.length() - 1));
        return sb.toString();
    }
}
