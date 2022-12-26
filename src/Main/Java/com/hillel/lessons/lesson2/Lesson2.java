package com.hillel.lessons.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        byte byteVariable = 100;
        System.out.println(byteVariable);

        short shortVariable = 100;
        System.out.println(shortVariable);

        int intVariable = 484848484;
        System.out.println(intVariable);

        long longVariable = 303003030303030L;
        System.out.println(longVariable);

        float floatVariable = 1.49949494F;
        double doubleVariable = 9891.030303;

        System.out.println();
        System.out.println(doubleVariable);
        System.out.println(floatVariable);

        char charVariable = 'A';
        char charVariable2 = '5';
        char charVariable3 = '\u00B0';
        char charVariable4 = '\u5143';
        char charVariable5 = 'ї';

        System.out.println();
        System.out.println(charVariable);
        System.out.println(charVariable2);
        System.out.println(charVariable3);
        System.out.println(charVariable4);
        System.out.println(charVariable5);

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println(booleanTrue);
        System.out.println(booleanFalse);


        byte byte1 = 127;
        short short1 = byte1;
        System.out.println(short1);

        char charA = 'A';
        int intA = charA;
        System.out.println(intA);

        int age = 28;
        double ageDouble = age;
        System.out.println(age);

        byte byte2 = 127;
        double double2 = byte2;
        System.out.println(byte2);

        int x = 5000000;
        byte y = (byte) x;
        System.out.println(x);
        System.out.println(y);

    }


}
