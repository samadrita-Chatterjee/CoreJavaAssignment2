package in.ineuron.demo;

import java.util.HashSet;

public class ArraySubsetChecker {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Convert both arrays to HashSet
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        // Check if set1 is a subset of set2
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 2, 3, 1, 5};

        boolean isSubset = isSubset(array1, array2);

        if (isSubset) {
            System.out.println("Array1 is a subset of Array2.");
        } else {
            System.out.println("Array1 is not a subset of Array2.");
        }
    }
}

