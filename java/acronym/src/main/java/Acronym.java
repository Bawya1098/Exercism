class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = "";

        phrase = phrase.replaceAll("-", " ");
        phrase = phrase.replaceAll("_", " ");

        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0) {
                acronym = acronym + phrase.charAt(i);
            }
            if (Character.isSpaceChar(phrase.charAt(i)) && Character.isLetter(phrase.charAt(i + 1))) {
                acronym = acronym + phrase.charAt(i + 1);
            }
        }

        return acronym.toUpperCase();
    }
}
