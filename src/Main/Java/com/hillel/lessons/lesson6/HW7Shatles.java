package com.hillel.lessons.lesson6;

public class HW7Shatles {
    public static void main(String[] args) {



        int Counter = 0;
        for (int i = 1; ; i++) {
        if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 | i % 10 == 9) {
            continue;

        }

        System.out.println(i);
        Counter++;

        if (Counter == 100) {
            System.out.println("Shatles quantity: " + Counter);
            break;
        }


    }



}
}

