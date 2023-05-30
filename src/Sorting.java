public class Sorting extends Common {
    private int[] array;
    private final int lb = 0;
    private int ub;

    Sorting (int[] array) {
        this.array = array;
        this.ub = array.length-1;
    }

    int[] mergeSort() {
        return mergeSort(lb, ub);
    }
    private int[] mergeSort(int lb, int ub) {
        if (lb == ub)
            return new int[]{this.array[lb]};
        else {
            int mid = (lb+ub)/2;
            int[] a = mergeSort(lb, mid);
            int[] b = mergeSort(mid+1, ub);
            return merge(a, b);
        }
    }

    // 1. select a pivot element
    // 2. find correct position for that elements so that all left will be smaller and right will be bigger than pivot

    int[] quickSort() {
        this.quickSort(this.lb, this.ub);
        return this.array;
    }
    private void quickSort (int lb, int ub) {
        if (ub <= lb)
            return;
        int neutralPos = partition(lb, ub);
        quickSort(lb, neutralPos-1);
        quickSort(neutralPos+1, ub);
    }

    private int partition (int lb, int ub) {
        int pivot = this.array[lb];
        int i=lb, j;

        for (j=lb+1; j <= ub; j++) {
            if (this.array[j] <= pivot) {
                i++;
                int tmp = this.array[i];
                this.array[i] = this.array[j];
                this.array[j] = tmp;
            }
        }
        this.array[lb] = this.array[i];
        this.array[i] = pivot;
        return i;
    }
}
