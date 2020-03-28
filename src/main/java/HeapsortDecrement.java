public class HeapsortDecrement {
     public static void heapsort(int[] array) {

        // Turns the array to heap
        int arrSize = array.length;
        for (int i = arrSize / 2 - 1; i >= 0; i--) {
            heap(array, arrSize, i);
        }

        // Extract all elements from the heap.
        for (int i = arrSize - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }

    private static void heap(int[] array, int arrSize, int i) {
        int max = i;            // Set max as the root
        int left = 2 * i + 1;   // Set left child of i
        int right = 2 * i + 2;  // Set right child of i

        if (left < arrSize && array[left] < array[max])
            max = left;

        if (right < arrSize && array[right] < array[max])
            max = right;

        if (max != i) {
            int swap = array[i];
            array[i] = array[max];
            array[max] = swap;

            heap(array, arrSize, max);
        }
    }
}
