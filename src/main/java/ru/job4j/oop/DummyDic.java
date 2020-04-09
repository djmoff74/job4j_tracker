package ru.job4j.oop;

/**
 * Class DummyDic
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 09.04.2020
 */
public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String unknown = dic.engToRus("Java");
        System.out.println(unknown);
    }
}
