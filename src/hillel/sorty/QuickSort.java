package hillel.sorty;





public class QuickSort {
    public void primitivQuickSort(int[] arr, int from, int to) {
         if(from < to) {
            int justIndex = partition(arr, from, to);
            primitivQuickSort(arr, from, justIndex - 1);
            primitivQuickSort(arr, justIndex, to);

        }

    }


    public static  int partition (int[] arr, int from, int to){
            int rightIndex = to;
            int leftIndex = from;
            int pivot = arr [from];
            while (leftIndex <= rightIndex){
                while (arr[leftIndex] < pivot){
                    leftIndex++;
                }
                while (arr[rightIndex] > pivot){
                    rightIndex--;
                }
                if(leftIndex <= rightIndex){
                    swap (arr, rightIndex, leftIndex);
                    leftIndex++;
                    rightIndex--;
                }
            } return leftIndex;
    }
    public static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;

    }

    }

