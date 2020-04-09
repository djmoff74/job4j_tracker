package ru.job4j.oop;

/**
 * Class Story
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.04.2020
 */
public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
