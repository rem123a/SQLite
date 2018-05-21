package com.example.rem.sqlite.Model;

public class Student {
    private String name, detail;
    private int gender;

    public Student(){

    }

    public Student(String name, String detail, int gender) {
        this.name = name;
        this.detail = detail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
