public class MaxMin {

    int min, max;

    MaxMin(int[] array) {
        this.min = this.max = array[0];
        this.minMax(array, 0, array.length-1);
    }

    int getMin() {
        return this.min;
    }

    int getMax() {
        return this.max;
    }

    void minMax(int[] array, int i, int j) {

        if (i==j) {
            if (array[i] < this.min)
                this.min = array[i];
            else if (array[j] > this.max)
                this.max = array[i];
        }

        else {
            int mid = (i+j) / 2;
            minMax(array, i, mid);
            minMax(array, mid+1, j);
        }
    }

}

















































//    int min, max;
//
//    MaxMin(int[] array) {
//        this.min = this.max = array[0];
//        minMax(array, 0, array.length-1);
//    }
//
//    int getMin() {
//        return this.min;
//    }
//    int getMax() {
//        return this.max;
//    }
//
//    void minMax(int[] array, int i, int j) {
//        if (i == j) {
//            if (array[i] < this.min)
//                this.min = array[i];
//
//            else if (array[i] > this.max)
//                this.max = array[i];
//        }
//
//        else {
//            int mid = (i+j) / 2;
//            minMax(array, i, mid);
//            minMax(array, mid+1, j);
//        }
//    }
