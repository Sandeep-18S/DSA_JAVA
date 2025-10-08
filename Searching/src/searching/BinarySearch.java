package searching;

public class BinarySearch {

    // Binary search method
    public static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // target not found
    }

    // Main method to test binary search
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 9, 14, 30};
        int key1 = 15;

        int index1 = binary_search(arr1, key1);
        if (index1 == -1)
            System.out.println("Element " + key1 + " not found");
        else
            System.out.println("Element " + key1 + " found at index: " + index1);

        int[] arr2 = {1, 2, 3, 4, 7, 8, 9};
        int key2 = 10;

        int index2 = binary_search(arr2, key2);
        if (index2 == -1)
            System.out.println("Element " + key2 + " not found");
        else
            System.out.println("Element " + key2 + " found at index: " + index2);
    }
}
