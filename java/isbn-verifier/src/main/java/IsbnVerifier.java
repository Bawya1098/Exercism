class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        int power = 10;
        stringToVerify = stringToVerify.replaceAll("-", "");
        if (stringToVerify.length() != 10) return false;
        if (!stringToVerify.substring(1, 10 - 1).matches("[0-9]+")) return false;
        int output = getResult(stringToVerify, power);
        return output % 11 == 0;
    }

    int getResult(String stringToVerify, int power) {
        int result = 0;
        for (int i = 0; i < stringToVerify.length(); i++) {
            if (Character.isDigit(stringToVerify.charAt(i))) {
                int number = Integer.parseInt(String.valueOf(stringToVerify.charAt(i)));
                result += number * power;
            } else {
                char letter = stringToVerify.charAt(i);
                result += (letter != 'X') ? 0 : 10 * power;
            }
            power -= 1;
        }
        return result;
    }
}
