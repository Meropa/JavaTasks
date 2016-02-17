//LADA'S
package ru.spbstu.appmath;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort<T> implements Sort<T>{

    public T[] sort(T[] arr, Comparator<T> comparator){
        T[] res = Arrays.copyOf(arr, arr.length);
        bubbleSort(res, comparator);
        return res;
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (isLess(arr, j+1, j, comparator)) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static <T> boolean isLess(T[] arr, int i, int j, Comparator<T> comparator) {
        boolean res = false;
        if(comparator.compare(arr[i], arr[j]) == 1)
            res = true;
        return res;
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}