package ru.job4j;

public class JR {
    public static void main(String[] args) {
        Man man;
        Woman woman = new Woman();
        //напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
