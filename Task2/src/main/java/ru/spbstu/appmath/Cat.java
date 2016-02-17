//LADA'S
package ru.spbstu.appmath;

public class Cat {
    private String name;
    private int age;
    private double tail_length;

    public Cat(String name, int age, double tail_length) {
        this.name = name;
        this.age = age;
        this.tail_length = tail_length;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getTailLength() {
        return tail_length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age= age;
    }

    public void setTailLength(double tail_length) {
        this.tail_length = tail_length;
    }
}

