import java.util.Arrays;
import java.util.Collections;

public class HomeWork2Arrays {

    public static void main(String[] args) {
        Integer[] arrayObjects = {2, 3, 1, 7, 11};
        int[] array = {1, 2, 7, -4, 9, 0, 7};
        arraySorting(arrayObjects);
        arrayAvg(array);
        arraySum(array);
    }

    private static void arraySorting(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    private static void arraySum(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 0)
                sum += number;
        }
        System.out.println(sum);
    }

    private static void arrayAvg(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        double avg = sum / array.length;
        System.out.println(avg);
    }
}

