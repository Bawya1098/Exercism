class ReverseString {
    String reverse(String inputString) {
        String string = "";
        if (inputString.equals("")) {
            return string;
        } else {
            char[] array = inputString.toCharArray();
            char[] result = new char[array.length];
            for (int i = array.length - 1; i >= 0; i--) {
                result[array.length-(i+1)] = array[i];
            }
            string = new String(result);
            return string;
        }
    }
}