import java.util.HashMap;

public class GenerateDocument {

    public static void main(String[] args) {
        System.out.println(generateDocument("Bste!hetsi ogEAxperlrt x ", "AlgoExpert is the Best!"));
    }


    public static boolean generateDocument(String characters, String document) {
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for(int i = 0; i < characters.length(); i++) {
            Character character = characters.charAt(i);
            characterMap.put(character, characterMap.getOrDefault(character, 0) + 1);
        }

        for(int i = 0; i < document.length(); i++) {
            Character character = document.charAt(i);
            if(!characterMap.containsKey(character) || characterMap.get(character) == 0)
                return false;
            characterMap.put(character, characterMap.get(character) - 1);
        }
        System.out.println(characterMap);

        return true;
    }
}
