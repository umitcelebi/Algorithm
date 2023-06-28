import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96));// expected output is 3
        getTotalX(Arrays.asList(2, 3, 6), Arrays.asList(42, 84)); // expected output is 2.
        getTotalX(List.of(50), List.of(51)); // expected output is 0.
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int aMax = Collections.max(a);
        int bMin = Collections.min(b);
        aa:
        for(int i = aMax; i <= bMin; i += aMax) {
            for (Integer value : a) {
                if (i % value != 0) {
                    continue aa;
                }
            }
            for (Integer integer : b) {
                if (integer % i != 0) {
                    continue aa;
                }
            }
            count++;
        }

        return count;
    }
}
