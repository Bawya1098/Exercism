import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        int n = 1 + a - 'A';
        ArrayList<String> diamond = new ArrayList<>(2 * n - 1);

        if (n == 1) {
            diamond.add("A");
        } else {
            char letter = 'A';
            diamond.add(String.format("%" + (n - 1) + "s" + letter + "%" + (n - 1) + "s", " ", " "));
            for (int i = 2; i < n; i++) {
                letter++;
                diamond.add(String.format("%" + (n - i) + "s" + letter + "%" + (2 * i - 3) + "s" + letter + "%" + (n - i) + "s", " ", " ", " "));
            }
            letter++;
            diamond.add(String.format("" + letter + "%" + (2 * n - 3) + "s" + letter, " "));

            for (int j = n - 2; j >= 0; j--) {
                diamond.add(diamond.get(j));
            }
        }
        return diamond;
    }
}

