import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcdcaf"));
    }

    public static int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if (characters.containsKey(character)) {
                characters.put(character, characters.get(character) + 1);
            } else {
                characters.put(character, 1);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if (characters.get(character) == 1) {
                return i;
            }
        }
        return -1;
    }
}