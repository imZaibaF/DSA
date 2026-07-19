/*Problem

Implement the QuickSort algorithm to sort an integer array in ascending order. The solution recursively partitions the array around a pivot element, ensuring elements smaller than the pivot are placed to its left and larger elements to its right until the entire array is sorted.

Approach

Choose the last element as the pivot and partition the array so that all smaller elements are moved before it. Place the pivot in its correct sorted position, then recursively apply the same process to the left and right subarrays. The recursion stops when a subarray contains zero or one element.

Time Complexity
Average Case: O(n log n)
Best Case: O(n log n)
Worst Case: O(n²) (when the pivot results in highly unbalanced partitions) */


public class qSort {
    public int[] solve(int[] A) {
    quickSort(A, 0, A.length - 1);
    return A;
    }
    private int partition(int[] A, int low, int high) {
    int pivot = A[high];
    int i = low;

    for (int j = low; j < high; j++) {
        if (A[j] <= pivot) {
            swap(A, i, j);
            i++;
        }
    }

    swap(A, i, high);
    return i;
    }
    private void quickSort(int[] A, int low, int high) {
    if (low >= high)
        return;

    int p = partition(A, low, high);

    quickSort(A, low, p - 1);
    quickSort(A, p + 1, high);
    }
    public static void swap(int[] A, int i, int j){
        int temp= A[i];
        A[i]= A[j];
        A[j]=temp;
    }
}
