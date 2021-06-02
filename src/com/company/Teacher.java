package com.company;

public class Teacher extends Man implements Printable {
    private String lesson;

    public Teacher(String name, int year, String lesson) {
        super(name, year);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public void print() {
        System.out.println("name: "+ getName());
        System.out.println("year: " + getYear());
        System.out.println("lesson: "+ getLesson());
    }
}
