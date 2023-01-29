package com.hillel.lessons.lesson11.HW13;

    public class IPhone implements Smartphones,IOS{
        String name;

        public IPhone(String name) {
            this.name = name;
        }


        @Override
        public void call() {
            System.out.println(name + " call functions");
        }



        @Override
        public void methodIOS() {
            System.out.println(name + " based on iOS ");
        }



        @Override
        public void sms() {
            System.out.println(name + " sms functions");
        }




        @Override
        public void internet() {
            System.out.println(name + " internet functions");
        }



}


