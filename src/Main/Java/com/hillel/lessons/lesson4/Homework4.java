package com.hillel.lessons.lesson4;

public class Homework4 {

    public static void main(String[] args) {

        /*
Паралелепіпед:

Створити у новому класі main-метод;

Створити три змінні для зберігання сторін паралелепіпеда;

Порахувати обсяг у змінній volume;

Вивести на екран змінну volume у вигляді:

System.out.println("Об'єм паралелепіпеда = " + volume);

Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
         */


        int X = 10;
        int Y = 25;
        int Z = 15;

        //int A = X;
        //int B = Y;
        //int C = Z;


        int V = X * Y * Z;

        System.out.println("Сторона А = " + X + "см");
        System.out.println("Сторона B = " + Y + "см");
        System.out.println("Сторона С = " + Z + "см");
        System.out.println("Об'єм паралелепіпеда= " + V + " куб.см");








    }
}
