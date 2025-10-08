package sorting;
public class Selection_sorting {

    public static void selection_sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // ascending
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 30, 10, 9, 28, 17 };
        selection_sorting(data);

        System.out.println("Sorted Array in ascending order:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
