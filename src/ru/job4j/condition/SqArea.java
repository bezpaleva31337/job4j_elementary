package ru.job4j.condition;

public class SqArea {
    public static double height(double p, double k) {
        return p / (2 * (k + 1));
    }

    public static double length(double h, double k) {
        return (h * k);
    }

    public static double square(double L, double h) {
        return (L * h);
    }

    public static void main(String[] args) {
        double result1 = SqArea.height(6, 2);
        System.out.println(" p = 6, k = 2, Height = " + result1);
        double result2 = SqArea.length(result1, 2);
        System.out.println(" Length = " + result2);
        double result3 = SqArea.square(result2, result1);
        System.out.println(" Square = " + result3);
    }
}
