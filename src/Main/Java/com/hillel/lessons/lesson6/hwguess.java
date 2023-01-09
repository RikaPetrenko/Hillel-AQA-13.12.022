package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class hwguess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int)(10 * Math.random());
        int Try = 3;
        int i, guess;

        System.out.println("Потрібно вгадати число задумане системою. Усього спроб - 3");
        System.out.println("Якщо вгадаєте, будете дуже солодко спати вночі, і домашкові бабайки не будуть вас тривожити");

        for (i = 0; i < Try; i++) {

            System.out.println("Введіть число:");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Мої вітання! Ви вгадали число. Сьогодні нездані домашки не будуть заважати вашому сну!");
                break;
            }
            else if (number > guess && i != Try - 1) {
                System.out.println("Число більше за " + guess);
            }
            else if (number < guess && i != Try - 1) {
                System.out.println("Число менше за " + guess);
            }
        }

        if (i == Try) {
            System.out.println("Вупс, усі спроби, нажаль, вичерпано. Правильна відповідь була " + number);

        }
    }

    }




