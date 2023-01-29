package com.hillel.lessons.lesson11.HW13;

    public class Main {



        public static void main(String[] args) {

            System.out.println("Android Device: ");

            And samsungGNote = new And("Samsung Galaxy Note");
            samsungGNote.methodLinux();
            samsungGNote.sms();
            samsungGNote.call();
            samsungGNote.internet();
            System.out.println();

            System.out.println("iOS Device: ");

            IPhone iphone14pm = new IPhone("iPhone 14 Pro Max");

            iphone14pm.methodIOS();
            iphone14pm.sms();
            iphone14pm.call();
            iphone14pm.internet();

        }

}
