package ru.yandex.calculator;

public class App {
    public static void main(String[] args) {

        System.out.println(multiplication(22, 10, 10, 30));
        System.out.println(division(20, 10, 10));



    }

    public static Integer multiplication (Integer a, Integer b, Integer c, Integer d) {
        return a + b + c + d;
    }

    public static Integer division (Integer a, Integer b, Integer y) {
        return a / b / y;
    }

}

