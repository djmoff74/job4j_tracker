package ru.job4j.oop;

/**
 * Class Student
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.04.2020
 */
public class Student {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics );
    }

    public void song() {
        System.out.println("I believe I can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe Ican fly";
        petya.music(song);

    }
}
