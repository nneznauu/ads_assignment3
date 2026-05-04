import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dataset = {71, 69, 17, 12, 53, 99, 84, 91, 37, 57};

        int[] heapData = dataset.clone();
        HeapSort.buildMaxHeap(heapData);
        System.out.println(Arrays.toString(heapData));

        HeapSort.extractMax(heapData);
        System.out.println(Arrays.toString(heapData));

        int[] mergeData = dataset.clone();
        MergeSort.sort(mergeData, 0, mergeData.length - 1);
        System.out.println(Arrays.toString(mergeData));


        int[] quickData = dataset.clone();
        QuickSort.sort(quickData, 0, quickData.length - 1);
        System.out.println(Arrays.toString(quickData));


        int resultIndex = BinarySearch.search(quickData, 53);
        System.out.println(resultIndex);


        int[] dacData = dataset.clone();
        int[] range = DivideAndConquer.findRange(dacData, 0, dacData.length - 1);
        System.out.println("Min: " + range[0] + ", Max: " + range[1]);
        System.out.println("Range: " + (range[1] - range[0]));


        int[] hashData = dataset.clone();
        HashTable hashTable = new HashTable(7);

        for (int value : hashData) {
            hashTable.insert(value);
        }
        hashTable.display();
    }
}