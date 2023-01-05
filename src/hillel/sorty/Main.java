package hillel.sorty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {3, 10, 1, -5, 45, 21, 2, 15};

        String [] arrayList = new String [] {
                "Roman", "Andrew", "Slava", "Ira", "Sveta", "Luba", "Sasha", "Luda"
        };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayList));

        System.out.println("-----------------------Quickly sort-------------------------");

        QuickSort qs = new QuickSort();
        ObjectQuickSort oqs = new ObjectQuickSort();

        qs.primitivQuickSort(arr, 0, arr.length-1);
        oqs.objectQuickSort(arrayList, 0, arrayList.length-1);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayList));

        System.out.println("-----------------------Coctail sort-------------------------");

        CoctailSort cs = new CoctailSort();
        ObjectCoctailSort ocs = new ObjectCoctailSort();

        ocs.objectCoctailSort(arrayList);
        cs.coctailSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayList));


    }
}
