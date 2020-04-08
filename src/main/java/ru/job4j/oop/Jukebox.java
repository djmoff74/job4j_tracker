package ru.job4j.oop;

/**
 * Class Jukebox
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.04.2020
 */
public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox player = new Jukebox();
        player.music(1);
        player.music(2);
        player.music(3);
    }
}
