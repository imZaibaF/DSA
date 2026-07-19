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
