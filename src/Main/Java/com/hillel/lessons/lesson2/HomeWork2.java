package com.hillel.lessons.lesson2;

public class HomeWork2 {
    public static void main (String[] args) {

        String str = "Sierra Leone:";
        String str2 = "South:";
        String str3 = "North:";

        double South = 8.484444;
        double North = -13.234444;
        char charVariable = '\u00B0';
        char charVariable2 = '\u0020';
        //char charVariable = 32;

        System.out.println(str);
        System.out.println(str2 + "\u0020" + South + "\u00B0");
        System.out.println(str3 + "\u0020" + North + "\u00B0");


        System.out.println();
        System.out.println(str2);
        System.out.println(South);
        //System.out.println("South" + "\u00B0");
        System.out.println();
        System.out.println(str3);
        System.out.println(North);
        System.out.println(charVariable);
        System.out.println(charVariable2);






        //System.out.println();


    }
}
