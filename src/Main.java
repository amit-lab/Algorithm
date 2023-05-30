import java.util.Random;

public class Main extends Common {

    public static void main(String[] args) {
        int[] array = generateArray(30, 0, 100);

        Sorting sort = new Sorting(array);
        int[] sortedArray = sort.quickSort();

        for (int item : sortedArray)
            System.out.print(item + "   ");
        System.out.println();

    }

}

