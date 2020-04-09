package ru.job4j.oop;

/**
 * Class Cat
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.04.2020
 */
public class Cat {
    public String sound() {
        return  "may-may";
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
