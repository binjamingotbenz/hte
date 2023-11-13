package com.company.professions;

public class Driver extends Person {
    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }


    public String toString() {
        return "ФИО: " + fullName +
                "\nСтаж вождения: " + drivingExperience + " лет";
    }
}