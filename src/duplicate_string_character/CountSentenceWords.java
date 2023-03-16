package duplicate_string_character;

public class CountSentenceWords {
    public static void main(String[] args) {
        String s = "Fear leads to anger and anger leads to hatred";
        System.out.println(countWord(s));
    }

    private static int countWord(String s) {
        int counWord = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1 && s.charAt(i + 1) != ' ') {

                counWord++;
            }
        }

        return counWord;
    }
}


