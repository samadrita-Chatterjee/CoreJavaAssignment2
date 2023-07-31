//1. WAP to find the duplicates present in an array.

package in.ineuron.demo;

import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 4, 7, 8, 9, 9};

        // Method 1: Using a HashMap
        findDuplicatesUsingHashMap(arr);

        // Method 2: Using nested loops
        findDuplicatesUsingLoops(arr);
    }

    // Method 1: Using a HashMap
    public static void findDuplicatesUsingHashMap(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicates using HashMap: ");
        boolean foundDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.print("None");
        }

        System.out.println();
    }

    // Method 2: Using nested loops
    public static void findDuplicatesUsingLoops(int[] arr) {
        System.out.print("Duplicates using nested loops: ");
        boolean foundDuplicates = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicates = true;
                    break; // Once a duplicate is found, break the inner loop
                }
            }
        }

        if (!foundDuplicates) {
            System.out.print("None");
        }

        System.out.println();
    }
}

