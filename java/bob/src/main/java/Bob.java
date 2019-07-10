class Bob {
    String hey(String conversation) {
        conversation = conversation.trim();
        if (conversation.isEmpty()) {
            return "Fine. Be that way!";
        } else if (conversation.matches("^[A-Z0-9\\s\\W]*$") && !conversation.matches("^[0-9\\s\\W]*$")) {
            return (conversation.contains("?")) ? "Calm down, I know what I'm doing!" : "Whoa, chill out!";
        } else if (conversation.matches("^[a-zA-Z\\s0-9\\W]*\\?$")) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }
}