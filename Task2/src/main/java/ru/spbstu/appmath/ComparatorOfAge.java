//LADA'S
package ru.spbstu.appmath;

import java.util.Comparator;

public class ComparatorOfAge implements Comparator<Cat>{
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}
