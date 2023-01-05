package hillel.sorty;

public class ObjectQuickSort {


    public <T extends Comparable<T>>void objectQuickSort(T[] arr, int from, int to) {
        if(from < to) {
            int justIndex = partition(arr, from, to);
            objectQuickSort(arr, from, justIndex - 1);
            objectQuickSort(arr, justIndex, to);

        }

    }

    public static <T extends Comparable<T>> int partition (T[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        T pivot = arr [from];
        while (leftIndex <= rightIndex){
            int cmp = arr[leftIndex].compareTo(pivot);
            while (cmp < 0){
                leftIndex++;
            }
            while (cmp > 0){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap (arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        } return leftIndex;
    }
    public static <T> void swap(T[] sequince, int i, int j) {
        T temp =  sequince[i];
        sequince[i] = sequince[j];
        sequince[j] = temp;
    }
}
