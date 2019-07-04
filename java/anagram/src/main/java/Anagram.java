import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> list) {
        List<String> wordsList = new ArrayList<>();
        char[] wordChar = word.toLowerCase().toCharArray();
        Arrays.sort(wordChar);
        for (String s : list) {
            boolean ret = checkWord(wordChar, s);
            if (ret) {
                if (!s.equalsIgnoreCase(word)) {
                    wordsList.add(s);
                }
            }
        }
        return wordsList;
    }

    boolean checkWord(char[] wordChar, String s) {
        if (s.length() == word.length()) {
            char[] chars = s.toLowerCase().toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < wordChar.length; i++)
                if (chars[i] != wordChar[i])
                    return false;
        } else {
            return false;
        }
        return true;
    }
}
