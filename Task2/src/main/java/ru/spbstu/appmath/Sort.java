//LADA'S
package ru.spbstu.appmath;

import java.util.Comparator;

public interface Sort<T> {
    T[] sort(T[] arr, Comparator<T> comparator);
}
