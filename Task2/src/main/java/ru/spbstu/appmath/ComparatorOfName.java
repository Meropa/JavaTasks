//LADA'S
package ru.spbstu.appmath;

import java.util.Comparator;

public class ComparatorOfName implements Comparator<Cat>{
    public int compare(Cat cat1, Cat cat2) {
        return (cat1.getName().compareTo(cat2.getName()));
    }
}
