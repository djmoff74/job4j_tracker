package ru.job4j.oop;

/**
 * Class Cat
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.04.2020
 */
public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("his name : " + this.name);
        System.out.println("his food : " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
