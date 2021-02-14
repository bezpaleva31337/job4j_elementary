package ru.job4j;

public class Main {
    public static void main(String[] args) {
        // 5 выражение
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println("Вывод в консоль значения после расширения: " + d);
    }
}