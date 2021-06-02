package com.company;

public class Soldier extends Man implements Printable{

    private String zvanie;

    public Soldier(String name, int year, String zvanie) {
        super(name, year);
        this.zvanie = zvanie;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    @Override
    public void print() {
        System.out.println("name: "+ getName());
        System.out.println("year:" + getYear());
        System.out.println("zvanie" + getZvanie());
    }
}
