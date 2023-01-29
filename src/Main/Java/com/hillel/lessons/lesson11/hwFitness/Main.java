package com.hillel.lessons.lesson11.hwFitness;

public class Main {

    public static void main(String[] args) {

        getUserData userTamara = new getUserData("Tamara", "Holding", 11, 12,
                1972, "example@example.com", "+3673838383", 56, 199,
                165, 45000);

        getUserData userEnrique = new getUserData("Enrique", "Iglesias", 12, 2,
                1987, "exomple@exomple.ia", "+996888477", 55, 120,
                77, 6);

        getUserData userDominique = new getUserData("Dominique", "Saragosa", 6, 3,
                1920, "silvuple@exompla.cim", "+099383838", 67, 188,
                9099, 7);


        System.out.println("Before Workout");
        System.out.println(userTamara.printAccountInfo());
        System.out.println(userEnrique.printAccountInfo());
        System.out.println(userDominique.printAccountInfo());

        System.out.println();
        System.out.println();



        System.out.println("Workout");

        userTamara.setStepCount(134321);
        System.out.println("Tamara walked a lot: " + userTamara.getStepCount());

        userTamara.setPressure(656);
        System.out.println("Tamara walked a lot: " + userTamara.getPressure());




        userEnrique.setStepCount(98777);
        System.out.println("The pressure also jumped: " + userEnrique.getStepCount());

        userEnrique.setPressure(646);
        System.out.println("The pressure also jumped: " + userEnrique.getPressure());

        System.out.println();


        System.out.println("Data of Tamara and Enrique after the Workout:");


        System.out.println(userTamara.printAccountInfo());
        System.out.println(userEnrique.printAccountInfo());




    }



    }






