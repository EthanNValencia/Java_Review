public class LevenshteinDistance {

    public static void main(String[] args){
        System.out.println(levenshteinDistance("abc", "yadb"));
        System.out.println(levenshteinDistance("replace", "delete"));
        System.out.println(levenshteinDistance("king", "tiger"));
        System.out.println(levenshteinDistance("softball", "baseball"));
    }


    public static int levenshteinDistance(String str1, String str2) {
        int[][] edits = new int[str2.length() + 1][str1.length() + 1];
        for(int i = 0; i < str2.length() + 1; i++) {
            for(int j = 0; j < str1.length() + 1; j++) {
                edits[i][j] = j;
            }
            edits[i][0] = i;
        }
        for(int i = 1; i < str2.length() + 1; i++) {
            for(int j = 1; j < str1.length() + 1; j++) {
                if(str2.charAt(i - 1) == str1.charAt(j - 1)) {
                    edits[i][j] = edits[i - 1][j - 1];
                } else {
                    edits[i][j] = 1 + Math.min(edits[i - 1][j - 1], Math.min(edits[i - 1][j], edits[i][j - 1]));
                }
            }
        }
        print(edits, str1, str2);
        return edits[str2.length()][str1.length()];
    }

    public static void print(int[][] edits, String str1, String str2) {
        String word1 = "  " + str1;
        String word2 = " " + str2;
        for(int i = 0; i < word1.length(); i++) {
            System.out.print(word1.charAt(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < str2.length() + 1; i++) {
            System.out.print(word2.charAt(i) + " ");
            for(int j = 0; j < str1.length() + 1; j++) {
                System.out.print(edits[i][j] + " ");
            }
            System.out.println();
        }
    }

}
