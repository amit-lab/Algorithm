public class Power {

    // it will only work if index is in power of 2
    int nth_power (int base, int index) {
        if (index == 1)
            return (base);
        else if (index == 0)
            return (1);
        else {
            int mid = (int)Math.floor(index/2);
            int b = nth_power(base, mid);
            return b*b;
        }
    }

}
