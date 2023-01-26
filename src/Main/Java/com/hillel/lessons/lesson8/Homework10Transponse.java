package com.hillel.lessons.lesson8;
import java.util.Scanner;

public class Homework10Transponse {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n ;
        int m ;



        while (true) {
            System.out.println("Please enter value N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Nope, not like that, I need a value higher, than 0");
                    scanner.nextLine();
                    continue;
                }

                break;
            } else {
                System.out.println("Nope. Try better next time!");
                scanner.nextLine();



            }
        }




        scanner.nextLine();


        while (true) {
            System.out.println("Please enter value M: ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m <= 0) {
                    System.out.println("Nope, not like that, I need a value higher, than 0");
                    scanner.nextLine();
                    continue;
                }
                break;
            } else {
                System.out.println("Nope. Try better next time!");
                scanner.nextLine();
            }
        }


        System.out.println("N = " + n);
        System.out.println("M = " + m);




        int[][] array1 = new int[n][m];

        int[][] array2 = new int[m][n];




        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }



        System.out.println("Values: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int temp = array1[i][j];
                array1[i][j] = array2[j][i];
                array2[j][i] = temp;
            }
        }




        System.out.println("Values Transponse: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
