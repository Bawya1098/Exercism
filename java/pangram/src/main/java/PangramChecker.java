import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean isPangram(String input) {
        String newPhrase = input.toLowerCase().replaceAll("[^A-Za-z]", "");
        Set<String> hashSet = new HashSet<>(Arrays.asList(newPhrase.split("")));
        return hashSet.size() >= 26;
    }
}