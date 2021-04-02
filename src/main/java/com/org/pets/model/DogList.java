package com.org.pets.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DogList {
    private int dogNum;

    public int getDogNum() {
        return dogNum;
    }

    public void setDogNum(int dogNum) {
        this.dogNum = dogNum;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBread() {
        return dogBread;
    }

    public void setDogBread(String dogBread) {
        this.dogBread = dogBread;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    private String dogName;
    private String dogBread;
    private String dogColor;
}
