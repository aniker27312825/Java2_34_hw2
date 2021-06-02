package com.company;

public class Doctor extends Man implements Printable{

    private String speciality;

    public Doctor(String name, int year, String speciality) {
        super(name, year);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void print() {
        System.out.println("name:"+ getName());
        System.out.println("year:"+ getName());
        System.out.println("speciality:"+ getSpeciality());
    }
}
