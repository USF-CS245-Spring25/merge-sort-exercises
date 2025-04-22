import java.util.Arrays;

public class MergeSort {

    /** public method for mergeSort
     *
     * @param arr input array
     */
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    /**
     * A private mergeSort method - takes an array, a temporary array, and the
     * indices that specify what part of the array we are working with (we need
     * to sort the part from low to high)
     *
     * @param arr input array
     * @param temp a temporary array used for merging
     * @param low starting index of the subarray we need to sort
     * @param high end index of the subarray we need to sort
     */
    private static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low >= high)
            return;
        // divide in half
        int mid = (low + high) / 2;
        mergeSort(arr, temp, low, mid);
        mergeSort(arr, temp, mid + 1, high);
        // merge two sorted halves into one sorted subarray
        merge(arr, temp, low, mid, high);
        //System.out.println(Arrays.toString(arr));
    }

    /**
     * Merge two sorted subarrays together, one that goes from low to mid another
     * goes from mid+1 to high. Uses a temporary array.
     *
     * @param arr - array
     * @param temp - temporary array - "scratch paper" (needed for merging two sorted chunks)
     * @param low - first index of the first sorted chunk of the array
     * @param mid - the last index of the first sorted chunk
     * @param high - the last index of the second sorted chunk
     */
    public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // Note: we could have created temp inside this method instead of passing it
        int i = low;
        int j = mid + 1;
        int k = low;
        while (k <= high) {
           // FILL IN CODE
        }
        // Copy the result from temp back to arr

        //System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 10, 100, 2, 4, 9, 14};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
