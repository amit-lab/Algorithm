public class BinarySearch {
    private int[] array;
    private int lb, ub;

    BinarySearch(int[] array) {
        this.array = array;
        this.lb = 0;
        this.ub = array.length;
    }

    boolean search(int key) {
        return this.search(key, this.lb, this.ub);
    }

    private boolean search(int key, int lb, int ub) {
        if (lb==ub) {
            if (this.array[lb] == key)
                return true;
            return false;
        }
        else {
            int mid = (lb+ub) / 2;
            if (this.array[mid] == key)
                return true;
            if (this.search(key, lb, mid))
                return true;
            else return this.search(key, mid + 1, ub);
        }
    }

    // find if "a[i] == i" for any integer 'i'
    int findInteger() {
        Sorting sort = new Sorting(this.array);
        this.array = sort.mergeSort();
        return findInteger(0, this.array.length-1);
    }
    private int findInteger (int lb, int ub) {
        if (lb == ub) {
            if (this.array[lb] == lb)
                return lb;
            else
                return -1;
        }
        else {
            int mid = (lb+ub)/2;
            if (this.array[mid] == mid)
                return mid;
            else if (this.array[mid] < mid)
                return this.findInteger(mid+1, ub);
            else
                return this.findInteger(lb, mid-1);
        }
    }

    // An array in which until some position there are integers and then infinity afterwords.
    // Find the position of the last integer in that array
    int findPositionOfLastInt (int MaxLimitOfInt) {
        return this.findPositionOfLastInt(this.lb, this.ub, MaxLimitOfInt);
    }
    private int findPositionOfLastInt (int lb, int ub, int limitOfInt) {
        int mid = (lb+ub)/2;
        if (this.array[mid] <= limitOfInt && this.array[mid+1] > limitOfInt)
            return mid;
        else if (this.array[mid] > limitOfInt && this.array[mid-1] <= limitOfInt)
            return mid-1;
        else if (this.array[mid] <= limitOfInt)
            return findPositionOfLastInt(mid+1, ub, limitOfInt);
        else if (this.array[mid] > limitOfInt)
            return findPositionOfLastInt(lb, mid-1, limitOfInt);
        return -1;
    }

    // different problem
    // until some point we have integers,
    // followed by infinities (basically more than max limit) and
    // then followed by '$'
    // Note here that size of array is unknown

    int getPositionOfFirstInfinity (int MaxLimitOfInt) {
        int pos = 1;
        int prevPos = 0;

        while (this.array[pos] <= MaxLimitOfInt) {
            prevPos = pos;
            pos = pos * 2;
        }

        return findPositionOfLastInt(prevPos, pos, MaxLimitOfInt) + 1; // +1 cuz we need first infinity position
    }

}
