class Proverb {
    String[] words;

     Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder result = new StringBuilder();
        if (words.length == 0) {
            return "";
        } else if (words.length == 1) {
            return display();
        } else {
            for (int i = 0; i < words.length - 1; i++) {
                String word = words[i];
                result.append("For want of a ").append(word).append(" the ").append(words[i + 1]).append(" was lost.").append("\n");
            }
            result.append(display());
            return result.toString();
        }
    }

    String display() {
        return String.format("And all for the want of a %s.", words[0]);
    }
}
