import java.util.Map;

class RomanNumeral {
    private String romanString = "";

    private static final Map<Integer, String> map = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    RomanNumeral(int input) {

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            int decimal = e.getKey();
            String roman = e.getValue();

            if (input >= decimal) {
                romanString += roman.repeat(input / decimal);
                input %= decimal;
            }
        }
    }

    public String getRomanNumeral() {
        return romanString;
    }

}
