import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork2Arrays {

    public static void main(String[] args) {
        Integer[] arrayObjects = {2, 3, 1, 7, 11};
        int[] array = {3, 3, 2, 3, 1, -4, 2, 8, -3};
        sortArrayDescOrder(arrayObjects);
        calculateArrayAvg(array);
        calculateArrayPositiveValuesSum(array);
        replaceArrayDuplications(array);
    }

    private static void sortArrayDescOrder(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    private static void calculateArrayPositiveValuesSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 0)
                sum += number;
        }
        System.out.println(sum);
    }

    private static void calculateArrayAvg(int[] array) {
        DecimalFormat df = new DecimalFormat("####0.00");
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        double avg = sum / array.length;
        System.out.println(df.format(avg));
    }

    private static void replaceArrayDuplications(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    array[k] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
