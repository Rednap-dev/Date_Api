import java.util.Arrays;
//№2
public class PredicateNeg {
    public static void main(String[] args) {
        int[] array = {1, -2, 2, 5, -6, 7, 9, 10};
        int[] array1 = new int[array.length];
        Predicate<Integer> negative = i -> i < 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!negative.test(i)) {
                if (array[i] > 0) {
                    array1[count++] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

