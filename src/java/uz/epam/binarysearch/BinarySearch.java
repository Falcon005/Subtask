package java.uz.epam.binarysearch;

public class BinarySearch {
    public  int binarySearch(int[] a, int key) {
        return binarySearch0(a, 0, a.length, key);
    }
    private  int binarySearch0(int[] a, int fromIndex, int toIndex,
                               int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}
