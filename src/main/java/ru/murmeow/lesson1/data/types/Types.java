package ru.murmeow.lesson1.data.types;

public class Types {
    public static void main(String[] args) {

        //1. Целые числа
        int x = 1; //стандрт
        int y = 2_000_000_000;

        byte b = -12; //-128 до 127
        long l = 2_000_000_000_000_000_000L; //хранит большие числа

        //2. числа с плавающей точкой
        double d = 2.11111111111555115155222222999934394932408472942; //стандарт
        //System.out.println(d);
        float f = 2.11111111111555115155222222999934394932408472942f;//занимает меньше памяти, но и короче

        //3. символы
        char c = 'a'; //a, b, c
        char symbol = '{';
        char numSymbol = 12345;//здесь представлено в Юникоде

        //4. Строки
        String s = "привет!";
        String newString = new String("Hello!");

        //5. Boolean (истина-ложь)
        boolean isCorrect = true;
        boolean isFalse = false;
    }
}
