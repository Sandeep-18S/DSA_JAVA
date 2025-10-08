package trickey_questions;

public class ssignment {


	    // Method to merge two sorted arrays
	    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
	        int length1 = arr1.length;
	        int length2 = arr2.length;
	        int[] merged = new int[length1 + length2];

	        int i = 0, j = 0, k = 0;

	        // Merge both arrays into merged[]
	        while (i < length1 && j < length2) {
	            if (arr1[i] <= arr2[j]) {
	                merged[k++] = arr1[i++];
	            } else {
	                merged[k++] = arr2[j++];
	            }
	        }

	        // Copy remaining elements from arr1
	        while (i < length1) {
	            merged[k++] = arr1[i++];
	        }

	        // Copy remaining elements from arr2
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
	        int[] array1 = {1, 3, 5, 7};
	        int[] array2 = {2, 4, 6, 8, 10};

	        System.out.println("First Sorted Array:");
	        printArray(array1);

	        System.out.println("Second Sorted Array:");
	        printArray(array2);

	        int[] mergedArray = mergeSortedArrays(array1, array2);

	        System.out.println("Merged Sorted Array:");
	        printArray(mergedArray);
	    }
	}


