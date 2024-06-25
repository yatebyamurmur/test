package ru.murmeow.lesson2.operations;

public class Operations {
    public static void main(String[] args) {

        //математические операции
        int intResult = 1 + 10 - 5;
        System.out.println("Int result: " + intResult);

        double doubleResult = 7.1 / (2 + 3);
        System.out.println("Double result: " + doubleResult);

        float floatResult = 6.842343f * 2.434343f;

        System.out.println("Float result: " + floatResult);

        //конкатенация (сложение) строк
        String firstString = "Hello, ";
        String secondString = "World!";
        String resultString = firstString + secondString + " Yes!" + " Ha-ha";
        System.out.println(resultString);

        //операции сравнения
        int num1 = 10;
        int num2 = 5;

        boolean numBoolResult = 10 > 5;// число 10 больше 5
        System.out.println("Bool result 1: " + numBoolResult);

        numBoolResult = 10 < 5;// число 10 меньше 5
        System.out.println("Bool result 2: " + numBoolResult);

        numBoolResult = 10 == 5; //число 10 равняется числу 5
        System.out.println("Bool result 3: " + numBoolResult);

        numBoolResult = 10 != 5; //число 10 НЕ равняется числу 5
        System.out.println("Bool result 4: " + numBoolResult);

        numBoolResult = 10 >= 5; //число 10 больше либо равняется числу 5
        System.out.println("Bool result 5: " + numBoolResult);

        numBoolResult = 10 <= 5; //число 10 меньше либо равняется числу 5
        System.out.println("Bool result 6: " + numBoolResult);

        numBoolResult = 5 < 5; //число 5 меньше числа 5
        System.out.println("Bool result 7: " + numBoolResult);

        numBoolResult = 5 <= 5; //число 5 меньше либо равно числу 5
        System.out.println("Bool result 8: " + numBoolResult);

        //вывод в консоль
        System.out.println(5 >= 5);
        System.out.println(10 + 5);
    }
}
