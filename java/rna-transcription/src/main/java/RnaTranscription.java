import java.util.ArrayList;
import java.util.List;

class RnaTranscription {
    String transcribe(String dnaStrand) {
        String result;
        if (dnaStrand.length() == 1) {
            result = checkDNA(dnaStrand.charAt(0));
        } else {
            result = getString(dnaStrand);
        }
        return result;
    }

    private String getString(String dnaStrand) {
        char[] string = dnaStrand.toCharArray();
        List<String> checkArray = new ArrayList<>(string.length);
        for (char c : string) {
            checkArray.add(checkDNA(c));
        }
        StringBuilder sb = new StringBuilder();
        for (String ch : checkArray) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private String checkDNA(char dnaStrand) {
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
                return null;
        }
    }
}

