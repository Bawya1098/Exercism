class Palindrome {
    boolean check(String sentence) {
        boolean result = true;
        String newSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetterOrDigit(sentence.charAt(i)))
                newSentence += sentence.toLowerCase().charAt(i);
        }
        for (int i = 0; i < newSentence.length(); i++) {
            if (newSentence.charAt(i) != newSentence.charAt(newSentence.length() - i - 1))
                result = false;
        }
        return result;
    }

}
