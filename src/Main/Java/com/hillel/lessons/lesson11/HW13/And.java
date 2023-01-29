package com.hillel.lessons.lesson11.HW13;


    public class And implements Smartphones,Linux{
        String name;

        public And(String name) {
            this.name = name;
        }

        @Override
        public void methodLinux() {
            System.out.println(name + " based on Linux ");
        }
        @Override
        public void call() {
            System.out.println(name + " call functions");
        }
        @Override
        public void sms() {
            System.out.println(name + " sms functions");
        }

        @Override
        public void internet() {
            System.out.println(name + " internet functions ");
        }


}
