package com.progr.objects;

public class Book {

    public Book(String sName, int sCost) {
        this.sName = sName;
        this.sCost = sCost;
    }

    public String getName() {
        return sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public int getCost() {
        return sCost;
    }

    public void setCost(int sCost) {
        this.sCost = sCost;
    }
    private String sName;
    private int sCost;
}
