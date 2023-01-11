package com.hillel.lessons.lesson7;

import java.util.Arrays;

public class HomeWork9Ragby {

    public static void main(String[] args) {
        // Є дві команди регбі з 25 гравців різного віку у кожній.
        //Вік беремо випадковим чином в діапазоні від 18 до 40.
        //Виведіть у двох рядках вік гравців кожної команди.
        //Порахуйте середній вік гравців кожної команди та виведіть на екран.


        //System.out.println("RagbyTeamOne Age Range:");
        int[] array1 = new int[25];
        int[] array2 = new int[25];



        for (int i=0; i < array1.length; i++) {
            int minimum = 18, maximum = 40;
            array2[i] = array1[i];
            array1[i] = (int)Math.floor(Math.random()*(maximum-minimum)+minimum);
            array2[i] = (int)Math.floor(Math.random()*(maximum-minimum)+minimum);
        }
        int sum1 = 0;
        for (int value : array1) {
            sum1 += value;
        }
        double avg1 = (double) sum1 / array1.length;


        int sum2 = 0;
        for (int value : array2) {
            sum2 += value;
        }
        double avg2 = (double) sum2 / array2.length;



        System.out.println();
        System.out.println("Вік гравців RagbyTeam1: " + Arrays.toString(array1));
        System.out.println("Середній вік гравця RagbyTeam1: " + avg1);
        System.out.println();
        System.out.println("Вік гравців RagbyTeam2: " + Arrays.toString(array2));
        System.out.println("Середній вік гравця RagbyTeam1: " + avg2);







    }
}
