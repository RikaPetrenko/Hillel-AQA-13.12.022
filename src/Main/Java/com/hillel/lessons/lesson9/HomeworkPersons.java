package com.hillel.lessons.lesson9;

public class HomeworkPersons {

    public static void main(String[] args) {
//        String name("Amanda", "Mirabella", "Hibiscus")
//        String lastName = "Smith", "Brown", "Tolkien";
//        String city = "Hibiscus", "Tolkien", "Kherson", "380394666666";
//        String phoneNumber = "380394444444", "380394555555", "380394666666";

//
//        String name = name;
//        String lastName = lastName;
//        String city =  " ";
//        String phoneNumber =  " ";
//        String personInfo(name, lastName, city, phoneNumber);
//        System.out.println(personInfo("Amanda", "Smith", "Odesa", "380394444444"));
//        System.out.println(personInfo("Mirabella", "Brown", "Mykolaiv", "380394555555"));
//        System.out.println(personInfo("Hibiscus", "Tolkien", "Kherson", "380394666666"));


//        String str = personInfo();
//        System.out.println(str);
//        String str = personInfo(" ", " ", " ", " ");

        personInfo("Amanda", "Smith", "Odesa", "380394444444");
        personInfo("Mirabella", "Brown", "Mykolaiv", "380394555555");
        personInfo("Hibiscus", "Tolkien", "Kherson", "380394666666");


    }


    static String personInfo(String name, String lastName, String city, String phoneNumber) {
        return "You may call " + name + " " + lastName + " from " + city + " by " + phoneNumber;

    }

}


