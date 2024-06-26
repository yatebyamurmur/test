package ru.murmeow.lesson3.classes;

public class Car {
    double weight;//это примитивный тип данных
    String color;
    double maxSpeed;

    public static void main(String[] args) {
        Car bmw = new Car();//это ссылочный тип данных
        bmw.color = "white";
        bmw.maxSpeed = 120.0;
        bmw.weight = 2.0;

        System.out.println("Цвет: " + bmw.color + "; скорость (км/ч): " + bmw.maxSpeed + "; вес (тонн):  " + bmw.weight);

        Car lada = new Car();
        lada.color = "black";
        lada.maxSpeed = 110.0;
        lada.weight = 1.5;

        System.out.println("Цвет: " + lada.color + "; скорость (км/ч): " + lada.maxSpeed + "; вес (тонн):  " + lada.weight);

        Car volvo;
        volvo = new Car();
        volvo.color = "red";
        volvo.maxSpeed = 130.0;
        volvo.weight = 2.1;

        System.out.println("Цвет: " + volvo.color + "; скорость (км/ч): " + volvo.maxSpeed + "; вес (тонн):  " + volvo.weight);
    }
}
