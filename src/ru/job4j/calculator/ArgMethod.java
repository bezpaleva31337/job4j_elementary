package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void ages(String age) {
        System.out.println("You are " + age);
    }

    public static void main(String[] args) {
        String name = "Alexey Ilyin";
        String age = "35 now";

        // ArgMethod.hello();

        ArgMethod.hello(name);

        ArgMethod.ages(age);

        // ArgMethod.hello(name, name, name);
    }
}