public class Sorting extends Common {
    int[] array;

    Sorting (int[] array) {
        this.array = array;
    }

    int[] mergeSort() {
        return mergeSort(0, this.array.length-1);
    }
    int[] mergeSort(int lb, int ub) {
        if (lb == ub)
            return new int[]{this.array[lb]};
        else {
            int mid = (lb+ub)/2;
            int[] a = mergeSort(lb, mid);
            int[] b = mergeSort(mid+1, ub);
            return merge(a, b);
        }
    }

}
