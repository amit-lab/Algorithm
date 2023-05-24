import java.util.Random;

public class Main extends Common {

    public static void main(String[] args) {
//        int[] array = generateArray(10, 0, 10);
//        System.out.println();
        int[] array = {10, 20, 30, 40, 30 ,0 , 34, 45, 640, 250, 832, 423, 3434};
        BinarySearch bs = new BinarySearch(array);
        System.out.println(bs.findPositionOfLastInt(100));
    }

}

