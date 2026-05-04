public class DivideAndConquer {
    public static int[] findRange(int[] arr, int low, int high) {
        if (low == high) {
            return new int[]{arr[low], arr[low]};
        }

        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                return new int[]{arr[low], arr[high]};
            } else {
                return new int[]{arr[high], arr[low]};
            }
        }

        int mid = (low + high) / 2;
        int[] leftRes = findRange(arr, low, mid);
        int[] rightRes = findRange(arr, mid + 1, high);

        int min = Math.min(leftRes[0], rightRes[0]);
        int max = Math.max(leftRes[1], rightRes[1]);

        return new int[]{min, max};
    }
}