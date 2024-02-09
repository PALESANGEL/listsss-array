import java.util.ArrayList;
import java.util.List;
//This program is created to print  the given example on the question

public class Main {
    public static int[] combine(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int maxLen = Math.max(len1, len2);

        for (int i = 0; i < maxLen; i++) {
            if (i < len1) {
                result.add(arr1[i]);
            }
            if (i < len2) {
                result.add(arr2[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 45};
        int[] arr2 = {1, 2, 3};

        int[] outcome = combine(arr1, arr2);


        for (int value : outcome) {
            System.out.print(value + " ");
        }
    }
}
