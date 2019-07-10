import java.util.HashMap;
import java.util.Map;

public class FoodChain {
    Map<Integer, String> rhymes = new HashMap<>();
    String input = "";

    Map<Integer, String> addrhymes() {
        rhymes.put(1, "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(2, "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(3, "I know an old lady who swallowed a bird.\n" +
                "How absurd to swallow a bird!\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(4, "I know an old lady who swallowed a cat.\n" +
                "Imagine that, to swallow a cat!\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(5, "I know an old lady who swallowed a dog.\n" +
                "What a hog, to swallow a dog!\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(6, "I know an old lady who swallowed a goat.\n" +
                "Just opened her throat and swallowed a goat!\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(7, "I know an old lady who swallowed a cow.\n" +
                "I don't know how she swallowed a cow!\n" +
                "She swallowed the cow to catch the goat.\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.");
        rhymes.put(8, "I know an old lady who swallowed a horse.\n" +
                "She's dead, of course!");
        return rhymes;
    }

    String verses(int startVerse, int stopVerse) {
        Map<Integer, String> rhymes = addrhymes();
        StringBuilder result = new StringBuilder();
        for (int i = startVerse; i <= stopVerse; i++) {
            input += rhymes.get(i);
            if (i != stopVerse) {
                input += "\n\n";
            }
        }
        result.append(input);
        return result.toString();
    }


    String verse(int verse) {
        Map<Integer, String> rhymes = addrhymes();
        return rhymes.get(verse);
    }


}

