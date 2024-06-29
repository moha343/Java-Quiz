import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FinalAssignment {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4};
        int[] result = findCommonElements(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Add all elements of array1 to set1
        for (int element : array1) {
            set1.add(element);
        }

        // Check which elements of array2 are in set1 and add them to commonSet
        for (int element : array2) {
            if (set1.contains(element)) {
                commonSet.add(element);
            }
        }

        // Convert the set of common elements to an array
        int[] commonArray = new int[commonSet.size()];
        int index = 0;
        for (int element : commonSet) {
            commonArray[index++] = element;
        }

        return commonArray;
    }
}
