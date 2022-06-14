import java.util.HashMap;

public class FirstRepeatingLetterPosition {
    public static void main(String[] args) {
        System.out.println(firstRepeatingCharacter("abcdcaf"));
    }

    public static int firstRepeatingCharacter(String string) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if(characters.containsKey(character)) {
                return characters.get(character) - 1;
            } else {
                characters.put(character, i);
            }
        }
        return -1;
    }

}
