package com.hillel.lessons.lesson11.hwFitness;


public class getUserData {

    final String firstName;

    String lastName;


    final int birthDateDay;


    final int birthDayMonth;


    final int birthDayYear;


    final String email;


    final String phoneNumber;


    int weight;


    int height;


    int pressure;


    int stepCount;


//_____________________________________________


    public String getfirstName() {
        return firstName;
    }


    public String getlastName() {
        return lastName;
    }


    public int getbirthDateDay() {
        return birthDateDay;
    }


    public int getbirthDayMonth() {
        return birthDayMonth;
    }


    public int getBirthDayYear() {
        return birthDayYear;
    }


    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getWeight() {
        return weight;
    }


    public int getHeight() {
        return height;
    }


    public int getPressure() {
        return pressure;
    }


    public int getStepCount() {
        return stepCount;
    }




    public getUserData(String firstName, String lastName, int birthDateDay, int birthDayMonth, int birthDayYear, String email, String phoneNumber, int weight, int height, int pressure, int stepCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDateDay = birthDateDay;
        this.birthDayMonth = birthDayMonth;
        this.birthDayYear = birthDayYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.height = height;
        this.pressure = pressure;
        this.stepCount = stepCount;
    }


    String printAccountInfo() {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nBirth Date: " + birthDateDay + "/" + birthDayMonth + "/" + birthDayYear + "\nEmail: " + email
                + "\nPhone Number: " + phoneNumber + "\nWeight: " + weight
                + "\nBlood Pressure: " + pressure + "\nStep Count: " + stepCount + "\nAge: " + Age();
    }


    public int Age() {
        return 2023 - birthDayYear;
    }



    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }



}


