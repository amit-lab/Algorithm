import java.util.Random;

public class Common {

    public static int[] generateArray(int size, int lb, int ub) {

        Random rand = new Random();
        int[] randNum = new int[size];

        for (int i = 0; i < size; i++)
            randNum[i] = rand.nextInt(lb, ub);
        for (int item : randNum)
            System.out.print(item + "   ");
        System.out.println();

        return randNum;
    }

    public static int[] generateDistinctArray(int size, int lb, int ub) {
        int[] array = new int[size];
        int finalSize = size;
        int randNum;
        boolean isPresent = false;
        Random random = new Random();


        for (int i=0; i<finalSize; i++) {
            randNum = random.nextInt(lb, ub);
            for (int item : array) {
                if (item == randNum)
                    isPresent = true;
            }
            if (isPresent) {
                finalSize++;
                continue;
            }
            else {
                array[i] = randNum;
            }
        }

        return array;
    }

    int[] merge(int[] array1, int[] array2) {

        int index1=0, index2=0;
        int index3=0;
        int len1 = array1.length;
        int len2 = array2.length;
        int totalSize = len1 + len2;
        int[] resultArray = new int[totalSize];

        for (int i=0; i < totalSize; i++) {
            // checking if one of the array is empty or not
            if (index1 >= len1) {
                for (int j=index2; j<len2; j++) {
                    resultArray[index3] = array2[j];
                    index3++;
                }
                break;
            }
            else if (index2 >= len2) {
                for (int j=index1; j<len1; j++) {
                    resultArray[index3] = array1[j];
                    index3++;
                }
                break;
            }
            // if both arrays are not empty
            if (array1[index1] < array2[index2]) {
                resultArray[index3] = array1[index1];
                index1++;
                index3++;
            }
            else if (array1[index1] >= array2[index2]) {
                resultArray[index3] = array2[index2];
                index2++;
                index3++;
            }
        }

        return resultArray;
    }



}
