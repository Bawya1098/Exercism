import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {
    String dnaStrand;
    Map<Character, Integer> count = new HashMap<>() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};

    NucleotideCounter(String dnaStrand) {
        if (!dnaStrand.matches("[ACGT]*"))
            throw new IllegalArgumentException();
        this.dnaStrand = dnaStrand;
    }

    Map<Character, Integer> nucleotideCounts() {
        if (dnaStrand.length() >= 1) {
            for (int i = 0; i < dnaStrand.length(); i++) {
                if (count.containsKey(dnaStrand.charAt(i)))
                    count.replace(dnaStrand.charAt(i), count.get(dnaStrand.charAt(i)) + 1);
            }
        } else return count;
        return count;
    }
}
