import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {
    List<String> resultList = new ArrayList<>();

    List<String> translate(String rnaSequence) {
        String result;
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String protein = rnaSequence.substring(i, i + 3);
            result = matchProtein(protein);
            if (result.equals("STOP")) {
                return resultList;
            } else {
                resultList.add(result);
            }
        }
        return resultList;
    }


    String matchProtein(String pattern) {
        String protein = "";
        if (pattern.matches("(AUG)")) {
            protein = "Methionine";
        }
        if (pattern.matches("(UUU|UUC)")) {
            protein = "Phenylalanine";
        }
        if (pattern.matches("(UUA|UUG)")) {
            protein = "Leucine";
        }
        if (pattern.matches("(UCU|UCC|UCA|UCG)")) {
            protein = "Serine";
        }
        if (pattern.matches("(UAU|UAC)")) {
            protein = "Tyrosine";
        }
        if (pattern.matches("(UGU|UGC)")) {
            protein = "Cysteine";
        }
        if (pattern.matches("(UGG)")) {
            protein = "Tryptophan";
        }
        if (pattern.matches("(UAA|UAG|UGA)")) {
            protein = "STOP";
        }
        return protein;
    }

}