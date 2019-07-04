import java.util.HashMap;
import java.util.Map;

class IsogramChecker {
    Map<Character, Integer> map = new HashMap<>();

    boolean isIsogram(String phrase) {
        return checkWord(phrase);
    }

    private boolean checkWord(String phrase) {
        boolean result = false;
        if (phrase.equals("")) {
            result = true;
        } else {
            result = checkIsogram(phrase);
        }
        return result;
    }

    private boolean checkIsogram(String phrase) {
        boolean result = false;
        String newPhrase = phrase.toLowerCase().replaceAll("-", "");
        char[] charArray = newPhrase.toCharArray();
        int count = 1;
        for (char c : charArray) {
            if (map.containsKey(c) && c != ' ') {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, count);
            }
        }
        for (Integer i : map.values()) {
            if (i > 1) {
                result = false;
                break;
            } else {
                result = true;

            }

        }
        return result;
    }

}