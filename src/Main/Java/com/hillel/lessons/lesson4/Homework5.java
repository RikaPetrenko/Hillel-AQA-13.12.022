package com.hillel.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {


        String Li = "Армія Лі:";

        double PowerLiWarrior = 13;
        double PowerLiArcher = 24;
        double PowerLiHorseman = 46;
        double LiWarriorAmount = 860;
        double LiArcherAmount = 860;
        double LiHorsemanAmount = 860;
        double LiTotal = LiWarriorAmount + LiArcherAmount + LiHorsemanAmount;
        double LiPower = PowerLiArcher + PowerLiHorseman + PowerLiWarrior;
        double LiTotalPower = LiPower * LiTotal;


        String Min = "Армія Мінь:";


        double MinMult = 1.5;
        double PowerMinWarrior = 9;
        double PowerMinArcher = 35;
        double PowerMinHorseman = 12;
        double MinWarriorAmount = LiWarriorAmount * MinMult;
        double MinArcherAmount = LiArcherAmount * MinMult;
        double MinHorsemanAmount = LiHorsemanAmount * MinMult;
        double MinTotal = MinHorsemanAmount + MinArcherAmount + MinHorsemanAmount;
        double MinPower = PowerMinArcher + PowerMinHorseman + PowerMinWarrior;
        double MinTotalPower = MinTotal * MinPower;

        // Лі - 860, Мінь 1290 Кожного типу

        System.out.println(Li);
        System.out.println("Загальна кількість лучників Лі: " + LiArcherAmount);
        System.out.println("Загальна кількість вершників Лі: " + LiArcherAmount);
        System.out.println("Загальна кількість воїнів Лі: " + LiHorsemanAmount);


        System.out.println(Min);

        System.out.println("Загальна кількість лучників Міня: " + MinArcherAmount);
        System.out.println("Загальна кількість вершників Міня: " + MinHorsemanAmount);
        System.out.println("Загальна кількість воїнів Міня: " + MinWarriorAmount);



        System.out.println("Битва:");
        System.out.println();



        //double MinTotal = (LiWarriorAmount + LiArcherAmount + LiHorsemanAmount) * MinMult;
        //double

        System.out.println("Особовий склад армії Мінь: " + MinTotal);
        System.out.println("Загальна потужність армії Мінь: " + MinTotalPower);
        System.out.println();
        System.out.println("vs.");
        System.out.println();
        System.out.println("Особовий склад армії Лі: " + LiTotal);
        System.out.println("Загальна потужність армії Лі: " + LiTotalPower);

        //double A = "Армія Лі, с загальною потужністю: " + LiTotalPower;
        //double B = "Армія Мінь, с загальною потужністю: " + MinTotalPower;
        //double C = Math.max(A,B);

        double A = LiTotalPower;
        double B = MinTotalPower;
        double C = Math.max(A,B);
        System.out.println();

        System.out.println("Перемагає: " + C);




        //double MinFinal =

        //System.out.println(("And the winner is:") + Math.max("Воїни Мінь, с загальною потужністю: " + MinTotalPower), ("Воїни Лі, с загальною потужністю: " + LiTotalPower));






    }
}
