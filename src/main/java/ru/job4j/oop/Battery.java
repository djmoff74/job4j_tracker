package ru.job4j.oop;

/**
 * Class Battery
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.04.2020
 */
public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(90);
        System.out.println("first : " + first.load + ". second : " + second.load + ".");
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load + ".");
    }
}
