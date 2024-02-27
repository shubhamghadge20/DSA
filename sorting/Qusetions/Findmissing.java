package sorting.Qusetions;

import java.util.Arrays;

public class Findmissing {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        missingNumber(arr);
        System.out.println("Missing number: " + findMissingNumber(arr));
    }

    public static void missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    // Helper method to find missing number
    static int findMissingNumber(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // If all elements are in their correct positions, the missing number is the length of the array
        return arr.length;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
