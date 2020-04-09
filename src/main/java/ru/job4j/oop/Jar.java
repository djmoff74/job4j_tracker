package ru.job4j.oop;

/**
 * Class Jar
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.04.2020
 */
public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(5);
        Jar second = new Jar(10);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
