import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Siruri {
    public static void main(String[] args) {
        int[] array = {12, 0, -22, 0, 43, 545, -4, -55, 12, 43, 0, -999, -87};
        Arrays.sort(array);
        System.out.println("Those are sorted:");
        System.out.println(java.util.Arrays.toString(array));
        sortnumber(array);
    }

    public static void sortnumber(int[] args) {
        HashMap<Integer, Integer> multiple = new HashMap<Integer, Integer>();
        List<Integer> pozitive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int item : args) {
            if (item > 0) {
                pozitive.add(item);
            } else if (item < 0) {
                negative.add(item);
            }

            if (multiple.containsKey(item)) {
                multiple.put(item, multiple.get(item) + 1);
            } else {
                multiple.put(item, 1);
            }
        }

        System.out.println("Numere pozitive:");
        System.out.println(java.util.Arrays.toString(pozitive.toArray()));
        System.out.println("Numere negative:");
        System.out.println(java.util.Arrays.toString(negative.toArray()));

        System.out.println("Numere duplicate:");
        multiple.forEach((k, v) -> {
            if (v > 1) {
                System.out.format("key: %d, value: %d", k, v);
            }
        });
    }


}






















