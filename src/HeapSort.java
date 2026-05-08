public class HeapSort {
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            make_heap(arr, n, i);
        }
    }

    public static void make_heap(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            make_heap(arr, n, largest);
        }
    }

    public static void extractMax(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        make_heap(arr, n - 1, 0);
    }
}
