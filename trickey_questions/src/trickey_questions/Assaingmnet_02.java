package trickey_questions;
import java.util.Arrays;
import java.util.Scanner;


public class Assaingmnet_02 {

	
	    // Method to merge two sorted arrays
	    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
	        int length1 = arr1.length;
	        int length2 = arr2.length;
	        int[] merged = new int[length1 + length2];

	        int i = 0, j = 0, k = 0;

	        while (i < length1 && j < length2) {
	            if (arr1[i] <= arr2[j]) {
	                merged[k++] = arr1[i++];
	            } else {
	                merged[k++] = arr2[j++];
	            }
	        }

	        while (i < length1) {
	            merged[k++] = arr1[i++];
	        }

	        while (j < length2) {
	            merged[k++] = arr2[j++];
	        }

	        return merged;
	    }

	    // Helper method to print an array
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input for first array (assumed sorted)
	        System.out.print("Enter size of first sorted array: ");
	        int size1 = scanner.nextInt();
	        int[] array1 = new int[size1];
	        System.out.println("Enter elements of first array (already sorted):");
	        for (int i = 0; i < size1; i++) {
	            array1[i] = scanner.nextInt();
	        }

	        // Input for second array (unsorted)
	        System.out.print("Enter size of second (unsorted) array: ");
	        int size2 = scanner.nextInt();
	        int[] array2 = new int[size2];
	        System.out.println("Enter elements of second array (unsorted):");
	        for (int i = 0; i < size2; i++) {
	            array2[i] = scanner.nextInt();
	        }

	        // Sort the second array before merging
	        Arrays.sort(array2);

	        // Merge the two sorted arrays
	        int[] mergedArray = mergeSortedArrays(array1, array2);

	        // Output result
	        System.out.println("Merged Sorted Array:");
	        printArray(mergedArray);

	        scanner.close();
	    }
	}


