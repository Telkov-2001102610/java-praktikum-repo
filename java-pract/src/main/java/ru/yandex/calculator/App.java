package ru.yandex.calculator;

public class App {
    public static void main(String[] args) {

        System.out.println(multiplication(20, 10, 10));
        System.out.println(division(20, 10, 10));



    }

    public static Integer multiplication (Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    public static Integer division (Integer a, Integer b, Integer c) {
        return a / b / c;
    }

}

