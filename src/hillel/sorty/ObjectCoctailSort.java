package hillel.sorty;

public class ObjectCoctailSort {
    public <T extends Comparable<T>> void objectCoctailSort(T[] sequince) {
        int left = 0;
        int right = sequince.length - 1;
        int control = right;
        for (; left < right;) {
            for (int i = left; i < right; i++) {
                int cmp = sequince[i].compareTo(sequince[i + 1]);

                if (cmp > 0) {
                    swap(sequince, i, i + 1);
                    control = i;
                }
            }
            right = control;
            for (int i = right; i > left; i--) {
                int cmp1 = sequince[i].compareTo(sequince[i - 1]);
                if (cmp1 < 0) {

                    swap(sequince, i, i - 1);
                    control = i;
                }
            }
            left = control;
        }
    }
    public static <T> void swap(T[] sequince, int i, int j) {
        T temp =  sequince[i];
        sequince[i] = sequince[j];
        sequince[j] = temp;
    }
}
