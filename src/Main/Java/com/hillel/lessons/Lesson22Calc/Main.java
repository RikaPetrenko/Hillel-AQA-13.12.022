package com.hillel.lessons.Lesson22Calc;

public class Main {

    public static void main(String[] args) {
        Calculator calculation = new Calculator();

        boolean result = calculation.subtraction(12, 20) == 140;
        System.out.println("Substraction test result: " + result);

        boolean additionResult = calculation.addition(12, 20) == 32;
        System.out.println("Addition test result: " + additionResult);

        boolean subtractionResult = calculation.subtraction(12, 20) == -8;
        System.out.println("Subtraction test result: " + subtractionResult);


        boolean multiplicationResult = calculation.multiply(12, 20) == 240;
        System.out.println("Multiplication test result: " + multiplicationResult);


        boolean divisionResult = calculation.division(12, 4) == 3;
        System.out.println("Division test result: " + divisionResult);
    }
    }



