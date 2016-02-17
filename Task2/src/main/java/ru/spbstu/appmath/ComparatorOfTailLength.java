//LADA'S
package ru.spbstu.appmath;

import java.util.Comparator;

public class ComparatorOfTailLength implements Comparator<Cat>{
    public int compare(Cat cat1, Cat cat2) {
        return Double.compare(cat1.getTailLength(), cat2.getTailLength());
    }
}
