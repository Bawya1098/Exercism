import java.util.ArrayList;
import java.util.List;

public class RNA {

    String transcribe(String dnaStrand) {
        String result;
        if (dnaStrand.length() == 1) {
            result = checkDNA(dnaStrand.charAt(0));
        } else {
            result = getString(dnaStrand);
        }
        return result;
    }

    String getString(String dnaStrand) {
        char[] string = dnaStrand.toCharArray();
        List<String> checkArray = new ArrayList<>(string.length);
        for (char c : string) {
            if (Character.isDigit(c) || Character.isWhitespace(c)) {
                throw new IllegalArgumentException("Invalid String Exception");
            }
            checkArray.add(checkDNA(c));
        }
        StringBuilder sb = new StringBuilder();
        for (String ch : checkArray) {
            sb.append(ch);
        }
        return sb.toString();
    }

    String checkDNA(char dnaStrand) {
        try {
            switch (dnaStrand) {
                case 'A':
                    return "U";
                case 'G':
                    return "C";
                case 'C':
                    return "G";
                case 'T':
                case 'U':
                    return "A";
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException S) {
            return "Invalid String";
        }
    }
}
