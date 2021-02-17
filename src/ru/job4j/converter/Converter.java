package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        double inn = 140;
        double expectedd = 2.3333333333333335;
        double outt = Converter.rubleToDollar(inn);
        boolean passedd = expectedd == outt;
        System.out.println("140 rubles are 2.3333333333333335 Test result : " + passedd);
    }
}