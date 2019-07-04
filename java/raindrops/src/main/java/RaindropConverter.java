import java.util.HashSet;
import java.util.Set;

class RaindropConverter {
     Set<Integer> factorSet = new HashSet<>();
     String result = "";

     String convert(int number) {
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factorSet.add(i);
            }
        }
        for (Integer n : factorSet) {
            switch (n) {
                case (3):
                    result += "Pling";
                    break;
                case (5):
                    result += "Plang";
                    break;
                case (7):
                    result += "Plong";
                    break;
            }
        }
        if (result.equals("")) result += number;
        return result;
    }
}
